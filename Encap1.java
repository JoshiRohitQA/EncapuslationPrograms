package encapsulation;

class Amazon{
	
	private String username="contact@grotechminds";
	private String password="rohit123";
	
	public String getUsername() {
		
		return username;
		
	}
	
	public void setUsername(String username) {
		this.username=username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	
}

public class Encap1 {
	public static void main(String[] args) {
		
		Amazon a1 = new Amazon();
		a1.setUsername("rohit@gmail.com");
		System.out.println(a1.getUsername());
		a1.setPassword("rohittest");
		System.out.println(a1.getPassword());
		
	}

}
