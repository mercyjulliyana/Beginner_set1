package Guvi;
import java.util.*;
public class NUMREV {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	StringBuffer sb=new StringBuffer(s);  
	String rev=sb.reverse().toString();
    System.out.println("Reverse String = "
            + rev); 


}
}
