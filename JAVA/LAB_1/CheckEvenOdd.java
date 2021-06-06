import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value := ");
		int num= scan.nextInt();
		if( num % 2 == 0)
			System.out.println("Given Value is even");
		else
			System.out.println("Given value is odd");
			
		
	}
}
