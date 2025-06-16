package in.orcas.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("wmg")
public class WishMessageGenerator {

    static {
        System.out.println("1️⃣ WishMessageGenerator.class file is loading...");
    }

    @Autowired
    private LocalDateTime date;

    public WishMessageGenerator() {
        System.out.println("2️⃣ WishMessageGenerator :: Zero-param constructor...");
    }

    public String generateWishMessage(String user) {
        System.out.println("3️⃣ WishMessageGenerator.generateWishMessage() called...");
        int hour = date.getHour();
        if (hour < 12) {
            return "Good Morning, " + user + "!";
        } else if (hour < 16) {
            return "Good Afternoon, " + user + "!";
        } else {
            return "Good Evening, " + user + "!";
        }
    }
}
