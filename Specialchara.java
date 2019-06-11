package Guvi;
import java.util.*;
public class Specialchara {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
    char[] ch=str.toCharArray();
    int count=0;

	for(int i=0;i<=str.length()-1;i++){
    if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='O'||ch[i]=='U'){
            count =0;
			
		}
    else{
    	count++;
    }
	}
    System.out.println(count);

}
}
