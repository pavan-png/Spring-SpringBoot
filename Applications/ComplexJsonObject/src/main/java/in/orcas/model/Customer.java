package in.orcas.model;


import java.util.List;

import lombok.Data;

@Data
public class Customer {
    private Integer id;
    private String firstName;
    private String lastName;
    private Boolean active;

    // HAS-A relationship
    private Address address;

    // Array/List of languages
    private List<String> languages;
}
