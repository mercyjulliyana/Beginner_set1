import java.util.*;
public class TakeoutExtraspaces {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String res=s.replaceAll("   "," ");
        System.out.println(res);
}
}
