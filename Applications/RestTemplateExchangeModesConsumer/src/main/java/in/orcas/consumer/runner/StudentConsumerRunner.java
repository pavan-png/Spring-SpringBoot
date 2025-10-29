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
        String baseUrl = "http://localhost:9090/api/student";

        // 1️⃣ POST — Save Student
        Student stu = new Student(101, "Pavan", 7500.0);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Student> saveReq = new HttpEntity<>(stu, headers);

        ResponseEntity<String> saveRes = restTemplate.exchange(
                baseUrl + "/save", HttpMethod.POST, saveReq, String.class);
        System.out.println(saveRes.getBody());

        // 2️⃣ GET — Fetch Student
        ResponseEntity<Student> getRes = restTemplate.exchange(
                baseUrl + "/find/{id}", HttpMethod.GET, null, Student.class, 101);
        System.out.println("GET -> " + getRes.getBody());

        // 3️⃣ PUT — Update Student
        stu.setFee(9000.0);
        HttpEntity<Student> updateReq = new HttpEntity<>(stu, headers);
        ResponseEntity<String> updateRes = restTemplate.exchange(
                baseUrl + "/update/{id}", HttpMethod.PUT, updateReq, String.class, 101);
        System.out.println(updateRes.getBody());

        // 4️⃣ DELETE — Delete Student
        ResponseEntity<String> delRes = restTemplate.exchange(
                baseUrl + "/delete/{id}", HttpMethod.DELETE, null, String.class, 101);
        System.out.println(delRes.getBody());
    }
}
