package config;


import entity.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//1.指定初始化销毁方法
@ComponentScan({"entity","BeanPostProcesser"})
@Configuration
public class MainConfigOfLifeCycle {
    @Scope("prototype")//多实例
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Car car(){
        return new Car();
    }


}
