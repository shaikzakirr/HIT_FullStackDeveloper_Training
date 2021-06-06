import java.util.Scanner;
public class PrimeCheck{
	public static void main(String[] args) {
		int temp;
		boolean isPrime=true;
		System.out.println("Enter your no :");
		Scanner x= new Scanner(System.in);
				int num=x.nextInt();
		for(int i=2 ; i<=num-1;i++) {
			temp=num%i;
			if(temp==0) {
				 isPrime=false;
				 break;
			}
		}
		if (isPrime)
			System.out.println(num + " is prime number ");
		else 
			System.out.println(num + " is not  prime number ");
	}
}