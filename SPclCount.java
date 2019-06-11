package Guvi;
import java.util.*;
public class SPclCount {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
	    char[] ch=str.toCharArray();
	    int count=0;

		for(int i=0;i<str.length();i++){
	    if((!(ch[i]>='a'&& ch[i]<='z') &&!(ch[i]>='A'&& ch[i]<='Z'))){
	    	if(!(ch[i]>='0' && ch[i]<='9')){
	    		count++;
	    	}
	    	
	    }
	 
		}
	    System.out.println(count);

	}
}
