package in.orcas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_master")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String course;
    private Double fee;

    public Student() {
    }

    public Student(Long id, String name, String course, Double fee) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.fee = fee;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public Double getFee() { return fee; }
    public void setFee(Double fee) { this.fee = fee; }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name +
               ", course=" + course + ", fee=" + fee + "]";
    }
}
