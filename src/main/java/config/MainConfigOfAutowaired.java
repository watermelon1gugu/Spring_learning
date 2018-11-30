package config;

import DAO.BookDAO;
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
}
