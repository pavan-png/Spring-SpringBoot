package in.orcas.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.orcas.model.Student;

@Service
public class StudentConsumerService {

    private final WebClient webClient;

    // Constructor-based injection
    public StudentConsumerService() {
        this.webClient = WebClient.create("http://localhost:9090");
    }

    // 1️⃣ Fetch single student using PATH parameter
    public Student getStudentById(Integer id) {
        return webClient.get()
                .uri("/student/{id}", id)
                .retrieve()
                .bodyToMono(Student.class)
                .block();
    }

    // 2️⃣ Fetch students using QUERY parameters
    public String getStudentsByFilters(String course, String city) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/student/search")
                        .queryParam("course", course)
                        .queryParam("city", city)
                        .build())
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
