import Service.BookService;
import config.MainConfigOfAutowaired;
import entity.Boss;
import entity.Car;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowairedTest {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfAutowaired.class);
        Boss boss = context.getBean(Boss.class);
        Car car = context.getBean(Car.class);
        System.out.println(boss.getCar());
        System.out.println(car);
    }
}
