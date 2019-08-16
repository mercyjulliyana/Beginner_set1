import java.util.*;
public class UPPERCASETOLOWER {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char []ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            String str=ch[i]+"";
        if(Character.isLowerCase(ch[i])){
    System.out.print(str.toUpperCase());
        }else{
            System.out.print(str.toLowerCase());
        }
    }
}
}
