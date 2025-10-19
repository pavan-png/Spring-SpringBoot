package in.orcas.JsonToPojo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.orcas.model.Customer;

public class App {
    public static void main(String[] args) {
        try {
            // Step 1: Create ObjectMapper (Jackson main class)
            ObjectMapper mapper = new ObjectMapper();

            // Step 2: Read data from JSON file → convert into Customer object
            Customer customer = mapper.readValue(new File("data/sample-lite.json"), Customer.class);

            // Step 3: Print the Java Object
            System.out.println(customer);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
