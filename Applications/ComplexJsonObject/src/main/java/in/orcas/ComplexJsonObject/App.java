package in.orcas.ComplexJsonObject;
import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.orcas.model.Customer;

public class App { 
    public static void main(String[] args) {
        try {
            // Create Jackson ObjectMapper
            ObjectMapper mapper = new ObjectMapper(); 

            // Read JSON file and convert into Customer object
            Customer customer = mapper.readValue(new File("data/sample.json"), Customer.class);

            // Print to verify
            System.out.println(customer);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
