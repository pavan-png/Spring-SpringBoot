package in.orcas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "ADDRESS_TAB")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;
    private String state;
    private String pincode;

    // Owning side: creates the foreign key column
    @OneToOne
    @JoinColumn(name = "student_id") // This creates the foreign key column in ADDRESS_TAB
    private Student student;
}
