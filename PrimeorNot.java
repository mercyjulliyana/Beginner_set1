package mercy;
import java.util.*;
public class PrimeorNot {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	boolean isprime=true;
	for(int i=2;i>n;i++) {
		if(n%i==0) {
			isprime=false;
			break;
		}
	}
	if(isprime) {
		System.out.println(n+"is a prime number");
	}else {
		System.out.println(n+"is not a prime number");
	}
}

}
