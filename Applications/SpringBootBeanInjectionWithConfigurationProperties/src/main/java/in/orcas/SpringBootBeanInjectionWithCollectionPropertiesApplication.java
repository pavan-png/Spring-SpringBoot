package in.orcas;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.orcas.comp.Employee;

@SpringBootApplication
public class SpringBootBeanInjectionWithCollectionPropertiesApplication {

    public static void main(String[] args) {
        // Boot up Spring and grab the context
        ConfigurableApplicationContext context =
            SpringApplication.run(SpringBootBeanInjectionWithCollectionPropertiesApplication.class, args);

        // Retrieve your Employee bean (populated from emp.info.*) and print it
        Employee employee = context.getBean(Employee.class);
        System.out.println(employee);

        // Gracefully shut down
        context.close();
    }
}
