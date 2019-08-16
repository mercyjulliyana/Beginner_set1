import java.util.*;
public class WordRev{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String str[]=s.split(" ");
    String res=" ";
    String revstring=" ";
    for(int i=0;i<str.length;i++){
        String word=str[i];
        res="";
        for(int j=word.length()-1;j>=0;j--){
            res=res+word.charAt(j);
        }
        revstring=revstring+res+" ";
    }
   System.out.println(revstring);
}
}
