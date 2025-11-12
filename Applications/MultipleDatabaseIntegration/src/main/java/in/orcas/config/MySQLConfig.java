package in.orcas.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableJpaRepositories(
    basePackages = "in.orcas.mysql.repo",
    entityManagerFactoryRef = "mysqlEntityManagerFactory",
    transactionManagerRef = "mysqlTransactionManager"
)
public class MySQLConfig {

    @Bean
    @ConfigurationProperties("spring.datasource.mysql")
    public DataSourceProperties mysqlDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    public DataSource mysqlDataSource() {
        return mysqlDataSourceProperties()
                .initializeDataSourceBuilder()
                .build();
    }

 // In MySQLConfig.java
    @Bean
    public LocalContainerEntityManagerFactoryBean mysqlEntityManagerFactory(
            @Qualifier("mysqlDataSource") DataSource dataSource,
            JpaSharedConfig jpaSharedConfig) {

        return jpaSharedConfig.entityManagerFactory(
                dataSource,
                "in.orcas.entity.mysql",
                "mysqlPU",
                "org.hibernate.dialect.MySQL8Dialect"
        );
    }

    @Bean
    public PlatformTransactionManager mysqlTransactionManager(
            @Qualifier("mysqlEntityManagerFactory") EntityManagerFactory emf) {
        return new JpaTransactionManager(emf);
    }
}