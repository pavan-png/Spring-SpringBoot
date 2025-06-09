package in.orcas.bean;

import java.util.Date;

public class Employee {
    private int eno;
    private String ename;
    private Date dob;
    private Department dept;

    public Employee(int eno, String ename, Date dob, Department dept) {
        this.eno = eno;
        this.ename = ename;
        this.dob = dob;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee [eno=" + eno + ", ename=" + ename + ", dob=" + dob + ", dept=" + dept + "]";
    }
}
