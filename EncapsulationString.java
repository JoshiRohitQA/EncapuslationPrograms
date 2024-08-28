package encapsulation;

class Email{
	private String email="rohit@gmail.com";
	
	public String getemail() {
		return email;
	}
	
	public void setemail(String email) {
		this.email=email;
	}
}

public class EncapsulationString {
	public static void main(String[] args) {
		Email e1 = new Email();
		e1.setemail("rohitjoshi4353@gmail.com");
		System.out.println(e1.getemail());
	}

}
