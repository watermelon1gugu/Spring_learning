package config;

import DAO.BookDAO;
import entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
//导入properties文件 使用${}取出配置文件的值
@PropertySource(value = "classpath:/person.properties")
@Configuration
public class MainConfigOfPropertyValues  {

    @Bean("bookDao2")
    public BookDAO bookDAO(){
        BookDAO bookDAO = new BookDAO();
        bookDAO.setLable("2");
        return bookDAO;
    }
}
