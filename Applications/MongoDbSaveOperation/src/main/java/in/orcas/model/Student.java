package in.orcas.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "students")
@Data                       // generates getters, setters, toString, equals, hashCode
@AllArgsConstructor         // generates constructor with all fields
@NoArgsConstructor          // generates default constructor
public class Student {
    @Id
    private String id;
    private String name;
    private int age;
    private String email;
}
