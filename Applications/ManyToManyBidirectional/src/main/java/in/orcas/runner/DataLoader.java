package in.orcas.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.orcas.entity.Course;
import in.orcas.entity.Student;
import in.orcas.repository.CourseRepository;
import in.orcas.repository.StudentRepository;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private CourseRepository courseRepo;

    @Autowired
    private StudentRepository studentRepo;

    @Override
    public void run(String... args) throws Exception {

        // === Step 1: Create and SAVE Courses FIRST ===
        Course java = new Course(); java.setCourseName("Java");
        Course python = new Course(); python.setCourseName("Python");
        Course spring = new Course(); spring.setCourseName("Spring Boot");

        List<Course> savedCourses = courseRepo.saveAll(List.of(java, python, spring));
        courseRepo.flush(); // Ensures IDs are assigned and entities are managed

        // Map by name for easy lookup
        Map<String, Course> courseMap = savedCourses.stream()
                .collect(Collectors.toMap(Course::getCourseName, Function.identity()));

        // === Step 2: Create Students ===
        Student s1 = new Student(); s1.setStudentName("Pavan");
        Student s2 = new Student(); s2.setStudentName("Nitin");

        // === Step 3: Set relationship ONLY on owning side (Student.courses) ===
        s1.setCourses(new ArrayList<>(List.of(
                courseMap.get("Java"),
                courseMap.get("Python"),
                courseMap.get("Spring Boot")
        )));

        s2.setCourses(new ArrayList<>(List.of(
                courseMap.get("Java"),
                courseMap.get("Spring Boot")
        )));

        // === Step 4: Save Students → Join table auto-populated ===
        studentRepo.saveAll(List.of(s1, s2));

        System.out.println("Data Saved Successfully!");
    }
}