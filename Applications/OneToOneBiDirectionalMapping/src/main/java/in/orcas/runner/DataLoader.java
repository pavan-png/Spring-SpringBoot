package in.orcas.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.orcas.entity.Address;
import in.orcas.entity.Student;
import in.orcas.repository.StudentRepository;

@Component
public class DataLoader implements CommandLineRunner {

    private final StudentRepository studentRepo;

    public DataLoader(StudentRepository studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        // Create Student
        Student student = new Student();
        student.setName("Nitin Manjunath");
        student.setCourse("Spring Boot");

        // Create Address
        Address address = new Address();
        address.setCity("Bangalore");
        address.setState("Karnataka");
        address.setPincode("560001");

        // Link both sides (important for bidirectional)
        address.setStudent(student);
        student.setAddress(address);

        // Save parent side (cascade will save Address automatically)
        studentRepo.save(student);

        System.out.println("✅ Student & Address saved successfully!");
    }
}
