package in.orcas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "STUDENT_TAB")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    private String studentName;
    private String course;

    // Many students belong to one department
    @ManyToOne
    @JoinColumn(name = "dept_id")  // Foreign key column in STUDENT_TAB
    private Department department;
}
