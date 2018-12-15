import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Erisu
 * @date 2018/12/6 18:58
 * @Description TODO
 * @Version 1.0
 **/
public class test {
    public static void main(String[] args) {

        System.out.println("hello world");
        try {
            generator();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void generator() throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //指定逆向工程配置文件
        File configFile = new File(System.getProperty("user.dir")+"/src/main/test/resources/mybatis.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                callback, warnings);
        myBatisGenerator.generate(null);
        System.out.println("生成完成");
    }


}
