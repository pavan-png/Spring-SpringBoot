package in.orcas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.orcas.comp.Company;

@SpringBootApplication
public class SpringBootConfigurationPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootConfigurationPropertiesApplication.class, args);
		Company company = context.getBean(Company.class);
		/*
		 * Naming (@Component("…")) is how Spring uniquely identifies each bean in its registry.

Type lookup (getBean(Class<?>)) is a convenience that lets you skip specifying the name—only when exactly one bean of that type exists.

Ambiguity (multiple beans) forces you to clarify: by name, by @Primary, or with @Qualifier. 
		 */
		System.out.println(company);
		
	}

}
