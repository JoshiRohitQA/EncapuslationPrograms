package encapsulation;

class Emp{
	private int salary=1232;
	  
	public int getsalary() {
		return salary;
	}
	
	public void setsalary(int salary) {
		this.salary=salary;
		
	}
}

public class EncapsulationINt {
	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.setsalary(1000);
		System.out.println(e1.getsalary());
		
	}
	


}
