import java.util.Calendar;
public class CalendarHolder {
    private int year;
    private int month;
    private int day;
    private Calendar calendar;

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void init() {
        calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
    }

    public Calendar getCalendar() {
        return calendar;
    }

    @Override
    public String toString() {
        return calendar.getTime().toString();
    }
}
