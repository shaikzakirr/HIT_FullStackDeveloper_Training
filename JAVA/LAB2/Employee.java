package zakir;

public class Employee {

	int empId ;
	String empName; 
	
	Employee (int id, String name){
		this.empId= id;
		this.empName=name;
		
	}
	
	void info() {
		System.out.println("Employee ID: "+ empId  + " Emploree Name :"+ empName);
	}
	 
	
	public static void  main (String args[]) {
		Employee obj1 = new Employee(101 , "zaks");
		Employee obj2 = new Employee(102,"shak");
				
		obj1.info();
		obj2.info();
		
	}	
}