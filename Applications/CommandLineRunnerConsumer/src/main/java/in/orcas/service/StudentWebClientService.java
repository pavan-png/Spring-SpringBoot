package in.orcas.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.orcas.model.Student;
import reactor.core.publisher.Mono;

@Service
public class StudentWebClientService {

    private final WebClient client;

    public StudentWebClientService() {
        client = WebClient.builder()
                .baseUrl("http://localhost:9090/student")
                .build();
    }

    // 1️⃣ POST → Save Student
    public Student saveStudent(Student student) {
        return client.post()
                .uri("/save")
                .body(Mono.just(student), Student.class)
                .retrieve()
                .bodyToMono(Student.class)
                .block();
    }

    // 2️⃣ GET → All Students
    public List<Student> getAllStudents() {
        Student[] array = client.get()
                .uri("/all")
                .retrieve()
                .bodyToMono(Student[].class)
                .block();
        return Arrays.asList(array);
    }

    // 3️⃣ GET → Student by ID
    public Student getStudentById(Integer id) {
        return client.get()
                .uri("/{id}", id)
                .retrieve()
                .bodyToMono(Student.class)
                .block();
    }

    // 4️⃣ PUT → Update Student
    public Student updateStudent(Student student) {
        return client.put()
                .uri("/update")
                .body(Mono.just(student), Student.class)
                .retrieve()
                .bodyToMono(Student.class)
                .block();
    }

    // 5️⃣ DELETE → Delete Student
    public String deleteStudent(Integer id) {
        return client.delete()
                .uri("/delete/{id}", id)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
