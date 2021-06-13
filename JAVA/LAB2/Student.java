/*Create a program that defines a class Student with the data 'name, city, 
and age,' as well as a method printData to display the data. To declare and 
access the values, create the objects s1 and s2
*/


package zakir;

public class Student {
	
	String  name , city;
	int age;
	static int m;
	void printData(){
		System.out.println("Student name : " + name);
		System.out.println("Student city : " + city);
		System.out.println("Student age :" + age);
	}
	
	public static void main (String args[]) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		s1.name="Harry";
		s1.city="America";
		s1.age = 22;
		s1.printData();
		s1.m=20; 
		s2.m=22; 
		Student.m=27;
		System.out.println("s1.m = "+s1.m); 
	}

}
 