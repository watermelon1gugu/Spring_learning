package entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("prototype")
@Component()
public class Cat implements DisposableBean, InitializingBean {

    public Cat(){
        System.out.println("Cat constructor");
    }

    public void destroy() throws Exception {
        System.out.println("cat...destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("cat...init");
    }
}
