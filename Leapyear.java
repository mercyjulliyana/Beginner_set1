import java.util.*;
public class Greatestnumber {
public static void main(String args[]) {
int a,b,c;
System.out.println("enter the 3 integer");
Scanner sc = new Scanner (System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b) {
	System.out.println(+a);
}else if(b>c) {
	System.out.println(+b);
}else {
	System.out.println(+c);
}
}
}
