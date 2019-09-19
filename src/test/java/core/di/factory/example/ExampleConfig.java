package core.di.factory.example;

import core.annotation.Bean;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;

//@Configuration
//@ComponentScan({ "core.di.factory.example" })
public class ExampleConfig {
    @Bean
    public DataSource dataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("org.h2.Driver");
        ds.setUrl("jdbc:h2:~/jwp-basic;AUTO_SERVER=TRUE");
        ds.setUsername("sa");
        ds.setPassword("");
        return ds;
    }
}
