package in.orcas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.orcas.service.EmailService;
import in.orcas.util.OtpGenerator;

@SpringBootApplication
public class SpringOtpMailAppApplication implements CommandLineRunner {

    @Autowired
    private EmailService emailService;

    public static void main(String[] args) {
        SpringApplication.run(SpringOtpMailAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Step 1: Generate OTP
        String otp = OtpGenerator.generateOtp();
        System.out.println("Generated OTP (for testing): " + otp);

        // Step 2: Receiver email
        String receiver = "mohanpavankalyan52@gmail.com";

        // Step 3: Send OTP mail
        String status = emailService.sendOtpMail(otp, receiver);

        System.out.println(status);
    }
}
