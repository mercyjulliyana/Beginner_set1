import java.util.Scanner;
public class VoworConsonant {
	public static void main(String args[]) {

	Scanner sc =new Scanner(System.in);
	char ch =sc.next().charAt(0);
	 if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='0'||ch=='u') {
		System.out.println("vowel");
	}
	else
	{
		System.out.println("consonant");
	}
	 }
	else {
		System.out.println("invalid");
	}
	

}
}
