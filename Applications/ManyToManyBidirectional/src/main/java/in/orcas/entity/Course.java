package in.orcas.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "course_tab")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;

    private String courseName;

    // INVERSE SIDE – mappedBy, no cascade, no JoinTable
    @ManyToMany(mappedBy = "courses", fetch = FetchType.LAZY)
    private List<Student> students = new ArrayList<>();
}