package in.orcas.service;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.orcas.model.Student;
import reactor.core.publisher.Mono;

@Service
public class StudentWebClientService {

    private final WebClient client;

    // Base URL of Producer App
    public StudentWebClientService() {
        this.client = WebClient.builder()
                .baseUrl("http://localhost:9090/api/student")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    // 1️⃣ GET - Retrieve student
    public void getStudent(Integer id) {
        Mono<Student> mono = client.get()
                .uri("/{id}", id)
                .retrieve()
                .bodyToMono(Student.class);

        mono.subscribe(
            student -> System.out.println("✅ GET Response: " + student),
            error -> System.err.println("❌ GET Error: " + error.getMessage())
        );
    }

    // 2️⃣ POST - Create student
    public void createStudent(Student student) {
        Mono<Student> mono = client.post()
                .body(Mono.just(student), Student.class)
                .retrieve()
                .bodyToMono(Student.class);

        mono.subscribe(
            created -> System.out.println("✅ POST Response: " + created),
            error -> System.err.println("❌ POST Error: " + error.getMessage())
        );
    }

    // 3️⃣ PUT - Update student
    public void updateStudent(Integer id, Student student) {
        Mono<Student> mono = client.put()
                .uri("/{id}", id)
                .body(Mono.just(student), Student.class)
                .retrieve()
                .bodyToMono(Student.class);

        mono.subscribe(
            updated -> System.out.println("✅ PUT Response: " + updated),
            error -> System.err.println("❌ PUT Error: " + error.getMessage())
        );
    }

    // 4️⃣ DELETE - Delete student
    public void deleteStudent(Integer id) {
        Mono<String> mono = client.delete()
                .uri("/{id}", id)
                .retrieve()
                .bodyToMono(String.class);

        mono.subscribe(
            msg -> System.out.println("✅ DELETE Response: " + msg),
            error -> System.err.println("❌ DELETE Error: " + error.getMessage())
        );
    }
}
