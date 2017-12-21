package com.sckj.utils;

import org.junit.jupiter.api.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @FileName： MybatisGeneratorTool
 * @Description： Mybatis逆向工程，代码生成器
 * @Author： JayYang
 * @Date： 2017-12-20 16:15
 * @Version: 1.0
 */

public class MybatisGeneratorTool {

    @Test
    public void generatorCodeTool() throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("F:\\JavaWeb_Projects\\SpringMVC_Mybatis_Shiro_Demo\\resource\\mybaits-generator.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

}
