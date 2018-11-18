package gokulukog;
import java.util.Scanner;
public class newo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=a,n,sum=0;
		while (a>0) {
			n=a%10;
			sum=sum+(n*n*n);
			a=a/10;
		}
			if (b==sum) {
			System.out.println("Yes ,"+ b +"is Armstrong number");
		}else {
			System.out.println("No ,"+ b +"is Not an Armstrong number");
		}
	}

}
