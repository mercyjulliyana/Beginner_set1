import java.util.Scanner;

public class AlphabetORnot {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	char ch=sc.next().charAt(0);
	if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
    System.out.println("alphabet");
	}
	else {
		System.out.println("no");
	}
}
}
