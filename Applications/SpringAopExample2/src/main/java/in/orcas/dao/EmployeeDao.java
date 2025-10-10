package in.orcas.dao;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

    public void saveEmployee() {
        System.out.println("Saving employee details into DB...");

        // Simulate random exception (like DB failure)
      //  if (new Random().nextInt(10) < 5) {
            throw new RuntimeException("Database connection failed!");
     //   }

     //   System.out.println("Employee data saved successfully ✅");
    }
}
