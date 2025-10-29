package in.orcas.consumer.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import in.orcas.consumer.model.Student;

@Component
public class StudentConsumerRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        RestTemplate restTemplate = new RestTemplate();

        // 1️⃣ Prepare URL
        String url = "http://localhost:9090/api/student/register";

        // 2️⃣ Prepare Body
        Student student = new Student(101, "Pavan", "Spring Boot");

        // 3️⃣ Prepare Headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("client-app", "StudentConsumerApp");

        // 4️⃣ Combine body + headers → HttpEntity
        HttpEntity<Student> requestEntity = new HttpEntity<>(student, headers);

        // 5️⃣ Send Request and Receive Response
        ResponseEntity<String> response = restTemplate.exchange(
                url,
                HttpMethod.POST,
                requestEntity,
                String.class
        );

        // 6️⃣ Print Response details
        System.out.println("Response Body   : " + response.getBody());
        System.out.println("Response Code   : " + response.getStatusCodeValue());
        System.out.println("Response Status : " + response.getStatusCode());
        System.out.println("Response Headers: " + response.getHeaders());
    }
}
