package gokulukog;
import java.util.Scanner;
public class findnumeric {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		int  a=scan.nextInt();
		int b[]=new int [a];
		for(int i=0,j=1;i<a;i++) {
			b[i]=scan.nextInt();
			System.out.println(b[i]+" "+j);j++;
			
		}
}
}