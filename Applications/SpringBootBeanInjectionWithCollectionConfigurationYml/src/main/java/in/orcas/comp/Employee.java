package in.orcas.comp;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("employee")
@ConfigurationProperties(prefix = "emp.info")
public class Employee {

    private String name;
    private long id;
    private Company company;

    // New fields
    private String[] skillSet;
    private List<String> projectName;
    private Set<Long> mobileNumbers;
    private Map<String, Object> idDetails;

    public Employee() {
        // default ctor
    }

    // existing getters/setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    // new getters/setters

    public String[] getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(String[] skillSet) {
        this.skillSet = skillSet;
    }

    public List<String> getProjectName() {
        return projectName;
    }

    public void setProjectName(List<String> projectName) {
        this.projectName = projectName;
    }

    public Set<Long> getMobileNumbers() {
        return mobileNumbers;
    }

    public void setMobileNumbers(Set<Long> mobileNumbers) {
        this.mobileNumbers = mobileNumbers;
    }

    public Map<String, Object> getIdDetails() {
        return idDetails;
    }

    public void setIdDetails(Map<String, Object> idDetails) {
        this.idDetails = idDetails;
    }

    @Override
    public String toString() {
        return "Employee{" +
               "name='" + name + '\'' +
               ", id=" + id +
               ", company=" + company +
               ", skillSet=" + java.util.Arrays.toString(skillSet) +
               ", projectName=" + projectName +
               ", mobileNumbers=" + mobileNumbers +
               ", idDetails=" + idDetails +
               '}';
    }
}
