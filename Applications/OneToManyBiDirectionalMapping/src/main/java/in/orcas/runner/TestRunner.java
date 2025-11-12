package in.orcas.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.orcas.entity.Department;
import in.orcas.entity.Student;
import in.orcas.repo.DepartmentRepository;

@Component
public class TestRunner implements CommandLineRunner {

    @Autowired
    private DepartmentRepository departmentRepo;

    @Override
    public void run(String... args) throws Exception {

        // Create students
        Student s1 = new Student();
        s1.setStudentName("Nitin");
        s1.setCourse("Spring Boot");

        Student s2 = new Student();
        s2.setStudentName("Manjunath");
        s2.setCourse("ReactJS");

        // Create department
        Department dept = new Department();
        dept.setDeptName("IT");

        // Link both sides
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);

        dept.setStudents(studentList);
        s1.setDepartment(dept);
        s2.setDepartment(dept);

        // Save department (CascadeType.ALL will also save students)
        departmentRepo.save(dept);

        System.out.println("✅ Data saved successfully!");
    }
}
