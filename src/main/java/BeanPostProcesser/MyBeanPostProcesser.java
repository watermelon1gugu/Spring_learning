package BeanPostProcesser;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
//将后置处理器加入到容器中
//IOC遍历容器中所有BeanPostProcessor 挨个执行beforeInitialization
//一旦返回Null 就跳出for循环

@Component
public class MyBeanPostProcesser implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("postProcessBeforeInitialization"+"=>"+s);
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("postProcessAfterInitialization"+"=>"+s);
        return o;
    }
}
