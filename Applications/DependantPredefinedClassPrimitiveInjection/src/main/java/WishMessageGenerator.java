public class WishMessageGenerator {
    private CalendarHolder calendarHolder;

    public WishMessageGenerator(CalendarHolder calendarHolder) {
        this.calendarHolder = calendarHolder;
    }

    public void printMessage() {
        System.out.println("Hello! Date is: " + calendarHolder);
    }
}
