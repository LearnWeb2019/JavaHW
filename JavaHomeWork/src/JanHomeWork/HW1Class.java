package JanHomeWork;

class Employee{
	int eid;
	String ename;
	String role;
	float salary;
	boolean activeEmp;
	
	Employee(){
		
	}
	
	Employee(int eid, String ename, String role, float salary, boolean flag){
		this.eid = eid;
		this.ename = ename;
		this.role = role;
		this.salary = salary;
		this.activeEmp = flag;
	}
}

public class HW1Class {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.eid = 1007;
		emp1.ename = "Rohit";
		emp1.role = "trainer";
		emp1.salary = 45378.98f;
		emp1.activeEmp = true;
		
		System.out.println("Employee 01 details: \n\tEmpolyee id :" + emp1.eid + "\n\tName: " + emp1.ename + 
				" \n\trole: "+ emp1.role+ " \n\trole: "+ emp1.salary + " \n\trole: "+ emp1.activeEmp);
		
		Employee emp2 = new Employee(1008, "Nikitesh", "Lead", 58000.99f, true);
		System.out.println("Employee 02 details: \n\tEmpolyee id :" + emp2.eid + "\n\tName: " + emp2.ename + 
				" \n\trole: "+ emp2.role+ " \n\trole: "+ emp2.salary + " \n\trole: "+ emp2.activeEmp);

	}

}
