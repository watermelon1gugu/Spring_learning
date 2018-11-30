import config.MainConfig;
import config.MainConfigOfLifeCycle;
import entity.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class IOCTest {
    //对象创建 单实例在容器启动的时候创建对象 多实例在每次获取的时候创建对象

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
    //初始化 对象创建完成并赋值好后
    //销毁 单实例bean在容器关闭的时候进行销毁
    //JSR250
    /*
    @PostConstructor

   4.beanPostProcessorBeforeInitialization 在初始化之前
     beanPostProcessorAfterInitialization

     spring底层对BeanPostProcessor
     bean赋值 注入其他组件 @AutoWire 生命周期注解功能 @Async,xxx BeanPostProcessor
     */
    @Test
    public void test02(){
        applicationContext.close();
        //多实例bean不进行销毁 容器不管理
    }
    @Test
    public void test(){
        String[] names = applicationContext.getBeanDefinitionNames();
        for(String name :names){
            System.out.println(name);
        }
        //获取工厂对象本身前面加& 默认获取工厂生产的对象
        Object bean2 = applicationContext.getBean("&ColorFactoryBean");
        System.out.println(bean2.getClass());

    }

}
