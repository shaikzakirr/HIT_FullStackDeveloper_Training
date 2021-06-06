
public class SwapTwoNumbers {
    public static void main(String[] args) {
       int first = 100 , second= 200;
       System.out.println("--Before swap--");
       System.out.println("First value : " + first);
       System.out.println("Second value : " + second);
       // assigning first value to temp variable
       int temporary = first;
       // assigning second value to first
       first = second;
       // assigning temp value to first
       second = temporary;
       
       System.out.println("--After swap--");
       System.out.println("First value : " + first);
       System.out.println("Second value : " + second);
    }
}
