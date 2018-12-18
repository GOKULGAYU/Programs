package gokulukog;
import java.util.Scanner;
public class betatmstrongnumber {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int sum=0,n=0,a=0;
		int from_no=scan.nextInt();
		int to_no=scan.nextInt();
		for(int i=from_no;i<=to_no;i++) {
			a=i;
			while(a!=0) {
				n=a%10;
				sum+=(n*n*n);n=0;
				a=a/10;
			}
			if (i==sum) {
				System.out.println(i+" ");
			}sum=0;
		}
	}

}
