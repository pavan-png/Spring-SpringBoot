package in.orcas.consumer;

import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class StudentConsumer implements CommandLineRunner {

    private final WebClient client = WebClient.create("http://localhost:9090");

    @Override
    public void run(String... args) throws Exception {

        System.out.println("🔹 Fetching Student by ID (101) from Producer...");

        // 1️⃣ Call HATEOAS endpoint
        Map response = client.get()
                .uri("/students/101")
                .retrieve()
                .bodyToMono(Map.class)
                .block();

        System.out.println("🎯 Received Student Response:");
        System.out.println(response);

        // 2️⃣ Read the HATEOAS link for 'all-students'
        Map<String, Map<String, String>> links = (Map<String, Map<String, String>>) response.get("_links");
        String allStudentsUrl = links.get("all-students").get("href");

        System.out.println("\n🌍 Now fetching all students using HATEOAS link...");

        // 3️⃣ Call the 'all-students' link dynamically
        Map allResponse = client.get()
                .uri(allStudentsUrl)
                .retrieve()
                .bodyToMono(Map.class)
                .block();

        System.out.println("📘 All Students Response:");
        System.out.println(allResponse);
    }
}
