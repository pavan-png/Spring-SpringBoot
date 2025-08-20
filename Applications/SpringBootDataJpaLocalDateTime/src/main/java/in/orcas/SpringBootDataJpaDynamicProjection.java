package in.orcas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.orcas.service.Employee1Service;

@SpringBootApplication
public class SpringBootDataJpaDynamicProjection {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDataJpaDynamicProjection.class, args);

		Employee1Service service = context.getBean(Employee1Service.class);

        System.out.println("Employees joined after 2022-01-01:");
        service.showEmployeesJoinedAfter();

        System.out.println("\nEmployees joined between 2021 and 2023:");
        service.showEmployeesJoinedBetween();  
	}

}
