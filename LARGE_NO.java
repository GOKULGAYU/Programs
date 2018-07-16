
import java.util.Scanner;
public class LARGE_NO {
public static void main(String[] args) {
	Scanner gk=new Scanner(System.in);
	int a=gk.nextInt();int b=gk.nextInt();int c=gk.nextInt();
	int max=a;
	if(a<b && b>c) max=b;
	if(a<c && b<c) max=c;
	if(a>b && a>c) max=a;
	System.out.println(max);
}
}
