package Service;

import DAO.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;

@Service
public class BookService {
    /*
    1) Autowired  自动注入
        1.优先按照类型去容器中找对应的逐渐 :applicationContext.getBean(BookDao.class);
        2.如果找到多个相同类型的组件 讲属性名作为组件id去容器中查找
        3.使用@Qualifier() 指定需要装配的id
        4.默认一定要将属性赋值好 否则报错 使用Autowired中设置是否必须
        5.@Primary 让Spring进行自动装配的时候 默认使用首选Bean
            也可以使用@Qualifier()指定需要装配的名字

     2) Spring还支持使用@Resource(JSR250)和@Inject(JSR330)  JAVA规范
        @Resource:
            可以和Autowired一样实现自动装配功能 默认按照组件名称装配 不能按照Primary和Qualifier

        @Inject:
            需要导入javax.inject的包 和Autowaired功能一样 可以primary 没有required属性


    3.    @Bean标注的方法 创建对象的时候 方法参数的值从容器中获取
    4.  自定义组件想要使用Spring容器底层的一些组件(ApplicationContext)
         自定义组件实现xxxAware，在创建对象的时候 会调用接口规定的方法注入相关组件
         xxxAware 功能都是使用xxxAwareProcessor实现 后置处理器
         ApplicationContextAware ==> ApplicationContextAwareProcessor

         判断bean是否实现了接口 然后权限检查 然后 invokeAwareInterFace
         方法内挨个判断bean实现了那些Aware接口 然后就从ioc池里注入
     */
    //@Qualifier("bookDAO")
    @Autowired(required = false)//构造器 参数 方法 属性 都可以标注Autowaired
    //@Resource(name = "bookDAO2")
    //@Inject
    private BookDAO bookDAO;

    public BookDAO getBookDAO() {
        return bookDAO;
    }

    public void setBookDAO(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }
}
