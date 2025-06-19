package in.orcas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.orcas.comp.Employee;

@SpringBootApplication
public class SpringBootBeanInjectionWithCollectionConfigurationPropertiesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootBeanInjectionWithCollectionConfigurationPropertiesApplication.class, args);
		  // Retrieve the Employee bean (populated via @ConfigurationProperties)
        Employee employee = context.getBean(Employee.class);
        System.out.println(employee);

        // Close context gracefully
        context.close();
	}

}
