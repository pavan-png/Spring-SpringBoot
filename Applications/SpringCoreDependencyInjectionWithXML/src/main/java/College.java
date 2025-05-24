
public class College {
	private Principal principal;

	

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}



	public void showCollegeInfo() {
		System.out.println("the principal name is "+principal.getName());
	}
}
