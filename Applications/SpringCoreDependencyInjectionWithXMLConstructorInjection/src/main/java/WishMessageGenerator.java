import java.time.LocalTime;

public class WishMessageGenerator {

    private LocalTime time;

    static {
    	System.out.println("class loaded");
    }
    
    /*
     * if you're using constructor injection, Spring directly uses the parameterized 
     *  constructor and skips the zero-arg constructor.
     */
    public WishMessageGenerator() {
        System.out.println("Zero-arg constructor called");
    }


    public WishMessageGenerator(LocalTime time) {
		this.time = time;
		System.out.println("parameterized constructor called");
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
