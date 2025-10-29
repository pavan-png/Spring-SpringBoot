package in.orcas.consumer.runner;

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
public class StudentConsumerRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        RestTemplate restTemplate = new RestTemplate();

        String url = "http://localhost:9090/api/student/register";

        // 1️⃣ Prepare request body
        Student stu = new Student(101, "Pavan", 7500.0);

        // 2️⃣ Prepare headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        // 3️⃣ Combine both into one request
        HttpEntity<Student> requestEntity = new HttpEntity<>(stu, headers);

        // 4️⃣ Send request and get full response
        ResponseEntity<String> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.POST,
                requestEntity,
                String.class
        );

        // 5️⃣ Print all parts of response
        System.out.println("Response Body        : " + responseEntity.getBody());
        System.out.println("Status Code Value    : " + responseEntity.getStatusCodeValue());
        System.out.println("Status Code Name     : " + responseEntity.getStatusCode().toString());
        System.out.println("Response Headers     : " + responseEntity.getHeaders());
    }
}
