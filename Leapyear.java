
import java.util.*;
public class Leapyear {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a year");
	int year=sc.nextInt();
	
	if(year%4==0) {
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}
	
}
}
