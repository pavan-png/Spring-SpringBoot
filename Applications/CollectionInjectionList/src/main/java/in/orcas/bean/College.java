package in.orcas.bean;

import java.time.LocalDate;
import java.util.List;

public class College {

    private List<String> nameList;
    private List<LocalDate> dateList;

    static {
        System.out.println("College.class file is loading...");
    }

    public College() {
        System.out.println("College object is instantiated...");
    }

    public void setNameList(List<String> nameList) {
        System.out.println("College.setNameList()");
        this.nameList = nameList;
    }

    public void setDateList(List<LocalDate> dateList) {
        System.out.println("College.setDateList()");
        this.dateList = dateList;
    }

    @Override
    public String toString() {
        return "College [nameList=" + nameList + ", dateList=" + dateList + "]";
    }
}
