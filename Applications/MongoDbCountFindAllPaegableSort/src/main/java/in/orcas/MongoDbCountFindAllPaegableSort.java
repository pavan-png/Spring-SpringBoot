package in.orcas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.orcas.model.Student;
import in.orcas.service.StudentService;

@SpringBootApplication
public class MongoDbCountFindAllPaegableSort{

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MongoDbCountFindAllPaegableSort.class, args);

        StudentService studentService = context.getBean(StudentService.class);

        // 1. Count students
        long total = studentService.countStudents();
        System.out.println("Total Students: " + total);

        // 2. Pagination (page 0, size 2)
        Page<Student> page = studentService.getStudentsByPage(PageRequest.of(0, 2));
        System.out.println("Page Content: " + page.getContent());

        // 3. Sorting (by name ascending)
        System.out.println("Students Sorted by Name:");
        studentService.getStudentsSorted(Sort.by("name").ascending())
                      .forEach(System.out::println);
    }
}
