package A;
import A.Employee;
public class APP {
	public static void main(String[] args) {
		System.out.println("-----------------------------------------------");
		APP app=new APP();
		Employee e=new Employee();
		
		e.setName("Ajay");
		e.setRoll(1);
		e.setSalary(25000);
		//app.display();
		System.out.println(e.toString());;
		System.out.println("-----------------------------------------------");
	}
	
	
	/*
	 * void display() {
	 * 
	 * System.out.println("Name :"+e.getName());
	 * System.out.println("Roll No :"+e.getRoll());
	 * System.out.println("Salary :"+e.getSalary()); }
	 */
}
