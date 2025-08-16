package in.orcas.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.orcas.entity.Student;
import in.orcas.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepo;

    public void demoOptionalMethods(Long id) {
        Optional<Student> optional = studentRepo.findById(id);

        // 1. isPresent() + get()
        if (optional.isPresent()) {
            Student s = optional.get();
            System.out.println("1. Found student using isPresent(): " + s);
        } else {
            System.out.println("1. Student not found!");
        }

        // 2. isEmpty()
        if (optional.isEmpty()) {
            System.out.println("2. No student found (using isEmpty())");
        }

        // 3. orElse()
        Student defaultStudent = optional.orElse(new Student(0L, "Default", "N/A", 0.0));
        System.out.println("3. Student (or default if missing): " + defaultStudent);

        // 4. orElseGet()
        Student lazyDefault = optional.orElseGet(() -> new Student(-1L, "LazyDefault", "N/A", 0.0));
        System.out.println("4. Student (using orElseGet()): " + lazyDefault);

        // 5. orElseThrow()
        try {
            Student s2 = optional.orElseThrow(() -> new RuntimeException("Student not found!"));
            System.out.println("5. Student found (orElseThrow): " + s2);
        } catch (Exception e) {
            System.out.println("5. Exception: " + e.getMessage());
        }

        // 6. ifPresent()
        optional.ifPresent(s -> System.out.println("6. ifPresent(): " + s.getName()));

        // 7. map()
        Optional<String> studentName = optional.map(Student::getName);
        System.out.println("7. Extracted name with map(): " + studentName.orElse("No Name"));

        // 8. filter()
        optional.filter(s -> s.getFee() > 5000)
                .ifPresent(s -> System.out.println("8. High fee student: " + s));
    }
}
