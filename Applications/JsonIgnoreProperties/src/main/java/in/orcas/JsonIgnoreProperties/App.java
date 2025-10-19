package in.orcas.JsonIgnoreProperties;


import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.orcas.model.Customer;

public class App {

    public static void main(String[] args) {

        try {
            // Step 1: Create ObjectMapper
            ObjectMapper mapper = new ObjectMapper();

            // Step 2: Read JSON file and convert it into POJO (Customer)
            Customer customer = mapper.readValue(new File("data/sample.json"), Customer.class);

            // Step 3: Display the POJO content
            System.out.println("=== Customer Details ===");
            System.out.println("ID         : " + customer.getId());
            System.out.println("First Name : " + customer.getFirstName());
            System.out.println("Last Name  : " + customer.getLastName());
            System.out.println("Active     : " + customer.getActive());

            System.out.println("\n--- Address Details ---");
            System.out.println("Street  : " + customer.getAddress().getStreet());
            System.out.println("City    : " + customer.getAddress().getCity());
            System.out.println("State   : " + customer.getAddress().getState());
            System.out.println("Zip     : " + customer.getAddress().getZip());
            System.out.println("Country : " + customer.getAddress().getCountry());

            System.out.println("\n--- Known Languages ---");
            for (String lang : customer.getLanguages()) {
                System.out.println(lang);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
