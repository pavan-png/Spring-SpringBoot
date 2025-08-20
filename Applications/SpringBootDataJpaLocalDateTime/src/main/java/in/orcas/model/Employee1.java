package in.orcas.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "employee_list_1")
public class Employee1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String company;
    private String country;
    private Double salary;
    private String position;

    // LocalDateTime column mapping
    private LocalDateTime joiningDate;

    // Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDateTime getJoiningDate() {
        return joiningDate;
    }
    public void setJoiningDate(LocalDateTime joiningDate) {
        this.joiningDate = joiningDate;
    }

    @Override
    public String toString() {
        return "Employee1 [id=" + id + ", name=" + name + ", company=" + company +
               ", country=" + country + ", salary=" + salary + ", position=" +
               position + ", joiningDate=" + joiningDate + "]";
    }
}
