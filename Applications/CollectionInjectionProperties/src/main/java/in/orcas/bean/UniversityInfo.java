package in.orcas.bean;

import java.time.LocalDate;
import java.util.Map;
import java.util.Properties;

public class UniversityInfo {
    private Map<Integer, String> facultyDetails;
    private Map<String, LocalDate> dateInfo;
    private Properties technologies;

    public void setFacultyDetails(Map<Integer, String> facultyDetails) {
        System.out.println("UniversityInfo.setFacultyDetails()");
        this.facultyDetails = facultyDetails;
        System.out.println(facultyDetails.getClass());
    }

    public void setDateInfo(Map<String, LocalDate> dateInfo) {
        System.out.println("UniversityInfo.setDateInfo()");
        this.dateInfo = dateInfo;
    }

    public void setTechnologies(Properties technologies) {
        System.out.println("UniversityInfo.setTechnologies()");
        this.technologies = technologies;
    }

    @Override
    public String toString() {
        return "UniversityInfo [facultyDetails=" + facultyDetails +
                ", dateInfo=" + dateInfo +
                ", technologies=" + technologies + "]";
    }
}
