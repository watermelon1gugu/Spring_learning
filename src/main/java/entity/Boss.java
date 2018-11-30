package entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//默认加在ioc容器中的组件 容器启动会调用无参构造器创建对象 在进行初始化赋值等操作
@Component
public class Boss {
    //标注在方法上 spring容器创建当前对象 就会调用方法 完成赋值
    //方法使用的参数 自定义类型的值从ioc容器中获取
    //如果当前只有一个有参构造器 Autowaired可以省略
    public Boss(Car car) {
        this.car = car;
        System.out.println("Boss有参构造器");
    }

    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
