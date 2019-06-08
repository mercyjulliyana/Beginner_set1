package Guvi;
import java.util.*;
public class Append {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	StringBuffer sb=new StringBuffer(s);  
	 String a=sb.append(".").toString();
	System.out.println(a);

}
}

