import config.MainConfig;
import entity.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class IOCTest {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

    @Test
    public void test(){
        String[] names = applicationContext.getBeanNamesForType(Person.class);
        for(String name :names){
            System.out.println(name);
        }
        Map<String, Person> beans = applicationContext.getBeansOfType(Person.class);

        System.out.println(beans);
    }

}
