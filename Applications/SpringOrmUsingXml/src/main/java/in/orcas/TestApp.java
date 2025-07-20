package in.orcas;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.orcas.model.StudentDTO;
import in.orcas.service.StudentService;

public class TestApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        StudentService service = (StudentService) context.getBean("studentService");

        // Save student
        StudentDTO dto = new StudentDTO();
        dto.setId(1002);
        dto.setName("Ravi");
        dto.setMarks(78);
        service.saveStudent(dto);

        // Update student
        dto.setName("Ravi Kumar");
        dto.setMarks(85);
        service.updateStudent(dto);

        // Fetch all students
        List<StudentDTO> list = service.getAllStudents();
        for (StudentDTO s : list) {
            System.out.println(s.getId() + " " + s.getName() + " " + s.getMarks());
        }

        // Fetch student by ID
        StudentDTO student = service.getStudentById(1002);
        if (student != null) {
            System.out.println("Fetched by ID: " + student.getId() + " " + student.getName() + " " + student.getMarks());
        }

        // Delete student
        service.deleteStudent(1002);

        // Verify deletion
        List<StudentDTO> remainingStudents = service.getAllStudents();
        System.out.println("Remaining Students: ");
        for (StudentDTO s : remainingStudents) {
            System.out.println(s.getId() + " " + s.getName() + " " + s.getMarks());
        }
    }
}