package in.orcas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor      // Generates default constructor (no-arg)
@AllArgsConstructor     // Generates constructor with all fields as arguments
public class Product {
    private int id;
    private String name;
    private double price;
}
