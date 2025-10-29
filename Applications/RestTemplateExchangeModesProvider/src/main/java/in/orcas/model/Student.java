package in.orcas.model;

public class Student {
    private Integer id;
    private String name;
    private Double fee;

    public Student() {}

    public Student(Integer id, String name, Double fee) {
        this.id = id;
        this.name = name;
        this.fee = fee;
    }

    // Getters and Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Double getFee() { return fee; }
    public void setFee(Double fee) { this.fee = fee; }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", fee=" + fee + "]";
    }
}
