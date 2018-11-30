package entity;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import sun.reflect.generics.scope.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class Dog {
    public Dog(){
        System.out.println("dog constructor");
    }
    @PostConstruct
    public void init(){
        System.out.println("Dog ... constructor");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Dog ... destroy");
    }
}
