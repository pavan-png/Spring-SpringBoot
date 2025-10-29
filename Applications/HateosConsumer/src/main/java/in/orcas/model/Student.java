package in.orcas.model;

public class Student {
    private Integer id;
    private String name;
    private String course;
    private String city;

    public Student() {}
    public Student(Integer id, String name, String course, String city) {
        this.id = id; this.name = name; this.course = course; this.city = city;
    }

    public Integer getId() { return id; }
    public String getName() { return name; }
    public String getCourse() { return course; }
    public String getCity() { return city; }
}
