package config;

import DAO.BookDAO;
import entity.Car;
import entity.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*
自动装配:
        spring 利用依赖注入(DI),完成对依赖的赋值
 */

@Configuration
@ComponentScan({"Service","Controller","DAO","entity"})
public class MainConfigOfAutowaired {
    @Primary
    @Bean("bookDAO2")
    public BookDAO bookDAO(){
        BookDAO bookDAO = new BookDAO();
        bookDAO.setLable("2");
        return bookDAO;
    }
    /*
    @Bean标注的方法 创建对象的时候 方法参数的值从容器中获取
     */
    @Bean
    public Color color(Car car){
        Color color = new Color();
        color.setCar(car);
        return color;
    }
}
