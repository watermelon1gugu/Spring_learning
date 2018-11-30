import Service.BookService;
import config.MainConfigOfAutowaired;
import entity.Boss;
import entity.Car;
import entity.Color;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowairedTest {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfAutowaired.class);
        Color color = context.getBean(Color.class);
        System.out.println(color);
        System.out.println(context);

    }
}
