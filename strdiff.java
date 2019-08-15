import java.util.*;
public class strdiff{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    int k=sc.nextInt();
    int count=0;
    if(s1.length()!=s2.length()){
                System.out.println("No");
                
    }
   else{
       for(int i=0;i<s1.length();i++){
    if(s1.charAt(i)!=s2.charAt(i)){
        count++;
}
    }
    if(count==k){
        System.out.println("yes");
    }
    else{
        System.out.println("No");
    }
   }
}
}
