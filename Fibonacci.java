package Guvi;
import java.util.*;
public class Fibonacci {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int a=0;
	int b=0;
	int c=1;
	int n=sc.nextInt();
	for(int i=1;i<=n;i++){
		a=b;
		b=c;
		c=a+b;
		System.out.println(a);

	}
}
}
