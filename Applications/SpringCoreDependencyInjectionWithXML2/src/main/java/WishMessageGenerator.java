import java.time.LocalTime;

public class WishMessageGenerator {

    private LocalTime time;

    public WishMessageGenerator() {
        System.out.println("Zero-arg constructor called");
    }

    public void setTime(LocalTime time) {
        this.time = time;
        System.out.println("Setter method called to inject LocalTime");
    }

    public String generateWishMessage(String name) {
        int hour = time.getHour();

        if (hour <= 12) {
            return "Hello :: " + name + " Good morning!!!!";
        } else if (hour <= 16) {
            return "Hello :: " + name + " Good Afternoon!!!!";
        } else {
            return "Hello :: " + name + " Good Evening!!!!";
        }
    }
}
