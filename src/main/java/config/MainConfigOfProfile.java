package config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import entity.Yellow;
import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringValueResolver;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/*
        Spring为我们提供的可以根据当前环境，动态的激活和切换一系列组件的功能
 */
@PropertySource("classpath:/dbconfig.properties")
@Configuration

/*
@Profile 指定组件在哪个环境的情况下才能注册到容器中，不指定则任何环境下都能注册
1.加了环境标识的bean只有环境被激活的时候才能注册到容器中
2.写在配置类上 只有指定的环境 整个配置类里的所有配置才能生效
 */
@Profile("test")
public class MainConfigOfProfile implements EmbeddedValueResolverAware {
    @Value("${db.user}")
    private String user;

    private StringValueResolver valueResolver;
    private String driverClass;

    @Bean
    public Yellow yellow(){
        return new Yellow();
    }
    @Profile("test")
    @Bean("testDataSource")
    public DataSource dataSourceTest(@Value("${db.password}") String pwd) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(pwd);
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setDriverClass(driverClass);
        return dataSource;
    }
    @Profile("dev")
    @Bean("devDataSource")
    public DataSource dataSource01(@Value("${db.password}") String pwd) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(pwd);
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/ssm");
        dataSource.setDriverClass(driverClass);
        return dataSource;
    }
    @Profile("product")
    @Bean("prodDataSource")
    public DataSource dataSource(@Value("${db.password}") String pwd) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(pwd);
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/produce");
        dataSource.setDriverClass(driverClass);
        return dataSource;
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver stringValueResolver) {
        this.valueResolver = stringValueResolver;
        driverClass = valueResolver.resolveStringValue("${db.driverClass}");
    }
}
