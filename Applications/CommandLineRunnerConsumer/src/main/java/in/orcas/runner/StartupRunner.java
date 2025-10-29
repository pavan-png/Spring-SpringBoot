package in.orcas.runner;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import in.orcas.model.Student;
import in.orcas.service.StudentWebClientService;

@Component
@Order(1)
public class StartupRunner implements CommandLineRunner {

    private final StudentWebClientService service;

    public StartupRunner(StudentWebClientService service) {
        this.service = service;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("🚀 Consumer started — Calling Producer APIs automatically...");

        // 1️⃣ Create Student
        Student s1 = new Student(101, "Pavan", "Spring Boot", 25000.0);
        Student saved = service.saveStudent(s1);
        System.out.println("✅ Saved: " + saved);

        // 2️⃣ Get All Students
        List<Student> list = service.getAllStudents();
        System.out.println("✅ All Students: " + list);

        // 3️⃣ Get Student by ID
        Student single = service.getStudentById(101);
        System.out.println("✅ One Student: " + single);

        // 4️⃣ Update Student
        single.setCourse("Spring Boot + React");
        Student updated = service.updateStudent(single);
        System.out.println("✅ Updated: " + updated);

        // 5️⃣ Delete Student
        String msg = service.deleteStudent(101);
        System.out.println("✅ Delete Response: " + msg);

        System.out.println("🎯 All API Calls Completed via CommandLineRunner");
    }
}
