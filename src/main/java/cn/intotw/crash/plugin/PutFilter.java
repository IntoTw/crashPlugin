//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package cn.intotw.crash.plugin;

import com.janetfilter.core.commons.DebugInfo;
import com.janetfilter.core.enums.RuleType;
import com.janetfilter.core.models.FilterRule;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PutFilter {
    private static Map<Object, Object> map;

    public PutFilter() {
    }

    public static void setRules(List<FilterRule> rules) {
        map = new HashMap();
        Iterator var1 = rules.iterator();

        while(var1.hasNext()) {
            FilterRule rule = (FilterRule)var1.next();
            if (rule.getType() == RuleType.EQUAL) {
                String[] sections = rule.getRule().split("->", 2);
                if (2 != sections.length) {
                    DebugInfo.output("Invalid record: " + rule + ", skipped.");
                } else {
                    map.put(sections[0], sections[1]);
                }
            }
        }

    }

    public static Object testPut(Object k, Object v) {
        if (null == k) {
            return v;
        } else {
            return map.containsKey(k) ? map.get(k) : v;
        }
    }
}
