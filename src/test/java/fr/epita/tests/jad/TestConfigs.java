package fr.epita.tests.jad;

import fr.epita.datamodel.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;
import java.util.Properties;


@Configuration
@ComponentScan(basePackages =
        {
                "fr.epita.services.dao"
        })
public class TestConfigs {

    @Bean("myFirstBean")
    public String getName(){
        return "Hello from Spring, Jad Traboulsi";
    }

    @Bean("patient")
    public Patient getPatient(){
        return new Patient(546994894161L,"Traboulsi","Jad","44 Voie Delacroix","0637269516",1,"16/04/1996");
    }

    @Bean("mainDS")
    public DataSource getDS(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setUrl("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1");
        ds.setUsername("test");
        ds.setPassword("test");
        ds.setDriverClassName("org.h2.Driver");

        return ds;
    }


    @Bean("session")
    public LocalSessionFactoryBean getSessionFactory(@Autowired DataSource ds){
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
        factoryBean.setDataSource(ds);
        factoryBean.setPackagesToScan("fr.epita.datamodel");
        Properties hibernateProperties = new Properties();
        hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
        hibernateProperties.setProperty("hibernate.show_sql", "true");
        factoryBean.setHibernateProperties(hibernateProperties);
        return factoryBean;
    }
}
