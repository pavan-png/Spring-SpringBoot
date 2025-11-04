package in.orcas.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender sender;

    private String fromEmail = "writesendermailhere@gmail.com"; // same as configured username

    public String sendOtpMail(String otp, String toEmail) throws Exception {

        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);

        helper.setFrom(fromEmail);
        helper.setTo(toEmail);
        helper.setSubject("Your OTP Code");
        helper.setSentDate(new Date());

        // Message body (HTML enabled)
        String htmlMsg = "<h2>Hello User 👋</h2>"
                       + "<p>Your One-Time Password (OTP) is:</p>"
                       + "<h1 style='color:blue;'>" + otp + "</h1>"
                       + "<p>This OTP is valid for 5 minutes.</p>"
                       + "<p>-- Team Orcas</p>";

        helper.setText(htmlMsg, true); // true = HTML mode

        sender.send(message);

        return "OTP Mail sent successfully to: " + toEmail;
    }
}
