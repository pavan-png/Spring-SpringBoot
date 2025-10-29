package in.orcas.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.orcas.model.Student;
import in.orcas.service.StudentConsumerService;

@Component
public class StudentRunner implements CommandLineRunner {

    private final StudentConsumerService service;

    public StudentRunner(StudentConsumerService service) {
        this.service = service;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n==============================");
        System.out.println("🚀 Starting Student Consumer");
        System.out.println("==============================");

        // 1️⃣ Using Path Parameter
        System.out.println("\n📘 Fetching student using Path Param...");
        Student s = service.getStudentById(101);
        System.out.println("✅ Received Student: " + s);

        // 2️⃣ Using Query Parameter
        System.out.println("\n📘 Fetching students using Query Params...");
        String response = service.getStudentsByFilters("java", "hyd");
        System.out.println("✅ Response: " + response);

        System.out.println("\n==============================");
        System.out.println("🎯 API Calls Completed");
        System.out.println("==============================");
    }
}
