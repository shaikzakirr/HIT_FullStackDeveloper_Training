
public class SwapNumbers {
	public static void main(String[] args) {
		int first=200 , second =300;
		System.out.println("---Before Swap");
		System.out.println("frst value :" + first);
		System.out.println("second  value :" + second);
		first = first - second;
		second = second + first;
		first = second-first;
		System.out.println("---After Swap");
		System.out.println("frst value :" + first);
		System.out.println("second  value :" + second);
	}
}
