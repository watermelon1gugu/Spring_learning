package config;

import entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfigOfPropertyValues  {

    @Bean
    public Person person(){
        return new Person();
    }
}
