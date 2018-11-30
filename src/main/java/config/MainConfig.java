package config;

import beanFactory.ColorFactoryBean;
import entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MainConfig  {



    @Bean
    public Person person(){
        return new Person("张三",50);
    }
    @Bean("bill")
    public Person person01(){
        return new Person("Bill",68);
    }
    @Bean("linus")
    public Person person02(){
        return new Person("linus",52);
    }

    @Bean("ColorFactoryBean")
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }
}
