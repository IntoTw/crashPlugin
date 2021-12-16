//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package cn.intotw.crash.plugin;

import com.janetfilter.core.Environment;
import com.janetfilter.core.models.FilterRule;
import com.janetfilter.core.plugin.MyTransformer;
import com.janetfilter.core.plugin.PluginEntry;
import java.util.ArrayList;
import java.util.List;

public class MyPluginEntry implements PluginEntry {
    private final List<MyTransformer> transformers = new ArrayList();

    public MyPluginEntry() {
    }
    @Override
    public void init(Environment environment, List<FilterRule> filterRules) {
        this.transformers.add(new CrashTransformer(filterRules));
    }
    @Override
    public String getName() {
        return "CrashPlugin";
    }
    @Override
    public String getAuthor() {
        return "intotw";
    }
    @Override
    public String getVersion() {
        return "v1.0.";
    }
    @Override
    public String getDescription() {
        return "CrashPlugin";
    }
    @Override
    public List<MyTransformer> getTransformers() {
        return this.transformers;
    }
}
