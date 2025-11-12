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
    basePackages = "in.orcas.postgres.repo",
    entityManagerFactoryRef = "postgresEntityManagerFactory",
    transactionManagerRef = "postgresTransactionManager"
)
public class PostgreSQLConfig {

      @Bean
    @ConfigurationProperties("spring.datasource.postgres")
    public DataSourceProperties postgresDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    public DataSource postgresDataSource() {
        return postgresDataSourceProperties()
                .initializeDataSourceBuilder()
                .build();
    }

 // In PostgreSQLConfig.java
    @Bean
    public LocalContainerEntityManagerFactoryBean postgresEntityManagerFactory(
            @Qualifier("postgresDataSource") DataSource dataSource,
            JpaSharedConfig jpaSharedConfig) {

        return jpaSharedConfig.entityManagerFactory(
                dataSource,
                "in.orcas.entity.postgres",
                "postgresPU",
                "org.hibernate.dialect.PostgreSQLDialect"
        );
    }

    @Bean
    public PlatformTransactionManager postgresTransactionManager(
            @Qualifier("postgresEntityManagerFactory") EntityManagerFactory emf) {
        return new JpaTransactionManager(emf);
    }
}