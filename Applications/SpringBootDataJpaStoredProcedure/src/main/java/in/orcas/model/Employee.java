package in.orcas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_list")  // maps to your Oracle table
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Oracle identity column
    private Long id;

    @Column(length = 50)
    private String name;

    @Column(length = 50)
    private String company;

    @Column(length = 50)
    private String country;

    private Double salary;

    @Column(length = 50)
    private String position;

    // --- Constructors ---
    public Employee() {}
    
    public Employee(String name, String company, String country, Double salary, String position) {
        this.name = name;
        this.company = company;
        this.country = country;
        this.salary = salary;
        this.position = position;
    }

    // --- Getters/Setters ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public Double getSalary() { return salary; }
    public void setSalary(Double salary) { this.salary = salary; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", company=" + company +
                ", country=" + country + ", salary=" + salary + ", position=" + position + "]";
    }
}
