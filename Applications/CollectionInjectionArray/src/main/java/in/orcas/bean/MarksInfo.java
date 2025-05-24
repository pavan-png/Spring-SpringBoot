package in.orcas.bean;

import java.time.LocalDate;
import java.util.Arrays;

public class MarksInfo {
	private int[] marks;
	private LocalDate[] dates;
	

    // Static block
    static  {
        System.out.println("Static block of MarksInfo executed");
        
    }

    // Constructor
    public MarksInfo() {
        System.out.println("Constructor of MarksInfo called");
    }
	
	public void setMarks(int[] marks) {
		System.out.println("setter called Marks");
		this.marks = marks;
	}
	public void setDates(LocalDate[] dates) {
		this.dates = dates;
		System.out.println("setter called dates");
	}
	

    public void display() {
        System.out.println("Marks: " + Arrays.toString(marks));
        System.out.println("Dates: " + Arrays.toString(dates));
    }
	
}
