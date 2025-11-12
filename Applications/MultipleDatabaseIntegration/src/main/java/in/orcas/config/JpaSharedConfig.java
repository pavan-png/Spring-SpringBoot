package in.orcas.config;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class JpaSharedConfig {

    // ✅ Create a local instance manually
    private final HibernateProperties hibernateProperties = new HibernateProperties();

    public LocalContainerEntityManagerFactoryBean entityManagerFactory(
            DataSource dataSource,
            String packagesToScan,
            String persistenceUnitName,
            String dialect) {

        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setDataSource(dataSource);
        factory.setPackagesToScan(packagesToScan);
        factory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        factory.setPersistenceUnitName(persistenceUnitName);

        factory.setJpaPropertyMap(
            hibernateProperties.determineHibernateProperties(
                Map.of("hibernate.dialect", dialect),
                new HibernateSettings()
            )
        );

        return factory;
    }
}
