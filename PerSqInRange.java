import java.util.*;
public class PerSqInRange{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int startnum=sc.nextInt();
    int Endnum=sc.nextInt();
int count=0;
for(int i=startnum;i<=Endnum;i++){
    int num=i;
    int sqrt=(int)Math.sqrt(num);
    if(sqrt*sqrt==num){
        count++;
    }
}
if(count>0){
    System.out.println(count);
}
}
}
