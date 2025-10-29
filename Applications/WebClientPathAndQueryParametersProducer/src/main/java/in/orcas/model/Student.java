package in.orcas.model;

public class Student {
    private Integer id;
    private String name;
    private String course;
    private String city;

    public Student() {}

    public Student(Integer id, String name, String course, String city) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.city = city;
    }

    // Getters & Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name +
               ", course=" + course + ", city=" + city + "]";
    }
}
