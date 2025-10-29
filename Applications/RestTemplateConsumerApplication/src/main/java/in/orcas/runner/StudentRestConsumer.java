package in.orcas.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import in.orcas.model.Student;

@Component
public class StudentRestConsumer implements CommandLineRunner {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("\n========= GET Example =========");

        // 1. Using getForEntity()
        ResponseEntity<Student> response1 = restTemplate.getForEntity(
                "http://localhost:9090/student/101", Student.class);

        System.out.println("Status Code : " + response1.getStatusCode());
        System.out.println("Response Body : " + response1.getBody());


        System.out.println("\n========= POST Example =========");

        // 2. Using exchange() for POST request
        Student s = new Student(105, "Kiran", "Chennai");

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Student> entity = new HttpEntity<>(s, headers);

        ResponseEntity<String> response2 = restTemplate.exchange(
                "http://localhost:9090/student",
                HttpMethod.POST,
                entity,
                String.class);

        System.out.println("Status Code : " + response2.getStatusCode());
        System.out.println("Response Body : " + response2.getBody());
    }
}
