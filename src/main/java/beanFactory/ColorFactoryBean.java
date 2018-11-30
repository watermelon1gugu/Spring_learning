package beanFactory;

import entity.Color;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;

public class ColorFactoryBean implements FactoryBean {
    public Object getObject() throws Exception {
        System.out.println("调用了FactoryBean");
        return new Color();
    }

    public Class<?> getObjectType() {
        return Color.class;
    }
    //是单例吗 在容器中保存一份
    public boolean isSingleton() {
        return true;
    }
}
