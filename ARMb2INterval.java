package Guvi;
import java.util.*;
public class ARMb2INterval {
public static void main(String args[]){
	Scanner sc=new Scanner (System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	int sum=0;
	for(int i=a+1;i<=b;i++){
	int	temp=i;
	sum=0;
		while(temp!=0){
			int rem=temp%10;
		    sum=sum+(rem*rem*rem);
		    temp=temp/10;
			
		}
	
		if(sum==i){
		System.out.println(i);
	}
}
}
}
