public class Student {
    private String name;
    private String city;

    public Student(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public void display() {
        System.out.println("Name: " + name + ", City: " + city);
    }
}
