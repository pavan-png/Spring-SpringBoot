package in.orcas.model;

public class Alien {
	 private Integer id;
	    private String name;
	    private String city;

	    // Constructors
	    public Alien() {}

	    public Alien(Integer id, String name, String city) {
	        this.id = id;
	        this.name = name;
	        this.city = city;
	    }

	    // Getters and Setters
	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    // toString (optional)
	    @Override
	    public String toString() {
	        return "Alien [id=" + id + ", name=" + name + ", city=" + city + "]";
	    }
}
