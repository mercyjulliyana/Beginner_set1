import java.util.*;
public class Arrayintegers {
public static void main(String args[]) {
	int N,K,sum=0;
	System.out.print("input");
	Scanner sc =new Scanner(System.in);
	N=sc.nextInt();
	K=sc.nextInt();
	System.out.println("enter array elements:");
	int arr[]=new int [N];
	for(int i=0;i<N;i++) {
		arr[i]=sc.nextInt();
	}
	for(int j=0;j<K;j++) {
		sum+=arr[j];
	}
	System.out.println(sum);
}
}
