import java.util.*;
public class PosNeg {
	public static void main(String args[]) {
     int n;
     System.out.println("enter the number");
     Scanner sc = new Scanner(System.in);
     n=sc.nextInt();
     if( n < 0) {
    	 System.out.println("negative number");
     }
     else if(n>0) {
    	 System.out.println("positive number");
     }
     else {
    	 System.out.println("Zero");
     }

}
}
