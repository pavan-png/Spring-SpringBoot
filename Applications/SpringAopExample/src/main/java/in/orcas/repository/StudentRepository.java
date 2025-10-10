package in.orcas.repository;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    public String saveStudent(String name) {
        System.out.println("Data Layer: Saving student details to database...");
        return "Student " + name + " registered successfully!";
    }
}
