import java.util.*;
public class Naturalnumbers {
public static void main(String args[]) {
	
{  Scanner sc=new Scanner(System.in);
	int num , i = 1, sum = 0;
	sc = new Scanner(System.in);
	
	System.out.print(" Please Enter any Number : ");
	num = sc.nextInt();	
	
	while(i <= num)
	{
		sum = sum + i; 
		i++;
	}	
	
	System.out.println("\n The Sum of Natural Numbers from 1 to "+ num+ " = " + sum);
}
}
}
