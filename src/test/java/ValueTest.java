import config.MainConfigOfLifeCycle;
import config.MainConfigOfPropertyValues;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValueTest {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);

    @Test
    public void test01(){
        printBeans(applicationContext);
    }

    public static void printBeans(AnnotationConfigApplicationContext applicationContext){
        Arrays.asList(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
    }

}
