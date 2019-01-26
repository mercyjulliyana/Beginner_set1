package mercy;
import java.util.*;
public class Exponential {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int base=sc.nextInt();
	int n=base;
	int exp=sc.nextInt();
	for (int i=0;i<exp;i++) {
		n=n*exp;
	}
	System.out.println(n);
	
	
	
}
}
