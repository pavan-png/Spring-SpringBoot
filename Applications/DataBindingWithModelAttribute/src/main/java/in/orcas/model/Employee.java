package in.orcas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                       // generates getters, setters, toString, equals, hashCode
@NoArgsConstructor          // generates a 0-parameter constructor
@AllArgsConstructor         // generates a parameterized constructor
public class Employee {
    private int eno;
    private String ename;
    private String eadd = "hyd";   // default value
    private float salary;
}
