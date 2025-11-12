package in.orcas.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "STUDENT_TAB")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String course;

    // Inverse Side of the relationship
    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Address address;
}
