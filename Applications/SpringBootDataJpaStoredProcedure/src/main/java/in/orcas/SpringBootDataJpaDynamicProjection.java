package in.orcas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.orcas.service.EmployeeService;

@SpringBootApplication
public class SpringBootDataJpaDynamicProjection {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDataJpaDynamicProjection.class, args);

        EmployeeService service = context.getBean(EmployeeService.class);
        service.callStoredProcedureExample(1L);  
	}

}
