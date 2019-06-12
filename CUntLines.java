package Guvi;
import java.util.*;
public class CUntLines {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	char [] ch=str.toCharArray();
	int count=0;
	for(int i=0;i<str.length();i++){
		if(ch[i]=='.'){
			count ++;
		}
	}
	System.out.println(count+1);
}
}
