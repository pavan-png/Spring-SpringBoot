package in.orcas.comp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("employee")
@ConfigurationProperties(prefix = "emp.info")
public class Employee {

    private String name;
    private long id;
    private Company company;

    public Employee() {
        System.out.println("employee constructor called");
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee{" +
               "name='" + name + '\'' +
               ", id=" + id +
               ", company=" + company +
               '}';
    }
}
