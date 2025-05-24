package in.orcas.bean;

import java.time.LocalDate;

public class PersonInfo {
    private Long pno;
    private String pname;

    private LocalDate dob; // Date of Birth
    private LocalDate doj; // Date of Joining
    private LocalDate dom; // Date of Marriage

    public PersonInfo(Long pno, String pname, LocalDate dob, LocalDate doj, LocalDate dom) {
        System.out.println("PersonInfo:: 5 param constructor....");
        this.pno = pno;
        this.pname = pname;
        this.dob = dob;
        this.doj = doj;
        this.dom = dom;
    }

    @Override
    public String toString() {
        return "PersonInfo [pno=" + pno + ", pname=" + pname +
               ", dob=" + dob + ", doj=" + doj + ", dom=" + dom + "]";
    }
}
