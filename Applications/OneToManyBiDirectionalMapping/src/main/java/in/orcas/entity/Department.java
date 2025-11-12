package in.orcas.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "DEPARTMENT_TAB")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deptId;

    private String deptName;

    // One Department has many Students
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Student> students;

    // Helper method to maintain both sides of the relationship
    public void addStudent(Student student) {
        students.add(student);
        student.setDepartment(this); // sets reverse link
    }
}
