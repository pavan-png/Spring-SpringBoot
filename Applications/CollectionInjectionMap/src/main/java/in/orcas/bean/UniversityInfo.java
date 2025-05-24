package in.orcas.bean;
import java.time.LocalDate;
import java.util.Map;

public class UniversityInfo {
    private Map<Integer, String> facultyDetails;
    private Map<String, LocalDate> dateInfo;

    public void setFacultyDetails(Map<Integer, String> facultyDetails) {
        System.out.println("UniversityInfo.setFacultyDetails()");
        this.facultyDetails = facultyDetails;
        System.out.println(facultyDetails.getClass());
    }

    public void setDateInfo(Map<String, LocalDate> dateInfo) {
        System.out.println("UniversityInfo.setDateInfo()");
        this.dateInfo = dateInfo;
    }

    @Override
    public String toString() {
        return "UniversityInfo [facultyDetails=" + facultyDetails + ", dateInfo=" + dateInfo + "]";
    }
}

