import config.MainConfig;
import config.MainConfigOfProfile;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.util.Arrays;

public class IOCTest_Profile {
    /*
    1.使用命令行动态参数 -Dspring.profiles.active=test
    2.代码方式 application不能直接用有参构造器 会调用refresh
     */

    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        //1.创建一个applicationContext
        //2.设置需要激活的环境
        //3.注册配置类设置需要激活的环境
        applicationContext.getEnvironment().setActiveProfiles("test");
        applicationContext.register(MainConfigOfProfile.class);
        applicationContext.refresh();

        Arrays.asList(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);


    }
}
