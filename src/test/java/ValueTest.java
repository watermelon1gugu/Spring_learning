import config.MainConfigOfLifeCycle;
import config.MainConfigOfPropertyValues;
import entity.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValueTest {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);

    @Test
    public void test01(){
        printBeans(applicationContext);
        ((Person)applicationContext.getBean("person")).print();
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        System.out.println(environment.getProperty("person.nickName"));
    }

    public static void printBeans(AnnotationConfigApplicationContext applicationContext){
        Arrays.asList(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
    }

}
