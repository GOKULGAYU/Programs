package gokulukog;
import java.util.Scanner;
public class minnum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();int c=0;
		int b[]=new int [a];
		for(int i=0;i<a;i++) {
			b[i]=scan.nextInt();
			if(i==0) {c=b[i]; }
			if(b[i]<c) {c=b[i];
				
			}
		}System.out.println(c);

	}

}
