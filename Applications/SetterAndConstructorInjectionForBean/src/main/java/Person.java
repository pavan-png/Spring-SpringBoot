
public class Person {
	private String pname;
	private Integer pid;
	private String paddress;
	private float income;
	
	static {
		System.out.println("Person.class is loaded");
	}
	
	
	public Person() {
		System.out.println("Person object is instantiated using zero-parameterized constructor");
	}
	public void setPname(String pname) {
		System.out.println("Person.setname");
		this.pname = pname;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
		System.out.println("Person.setid");
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
		System.out.println("Person.setaddress");
	}
	public void setIncome(float income) {
		this.income = income;
		System.out.println("Person.setincome");
	}
	public Person(String pname, Integer pid, String paddress, float income) {
		super();
		this.pname = pname;
		this.pid = pid;
		this.paddress = paddress;
		this.income = income;
		System.out.println("parameterized constructor called");
	}
	
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", pid=" + pid + ", paddress=" + paddress + ", income=" + income + "]";
	}
	
	
	
}
