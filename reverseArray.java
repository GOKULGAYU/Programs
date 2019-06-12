package newExamples;
import java.util.Arrays;
import java.util.Scanner;
public class reverseArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b[] =new int[a];
		for (int i=0;i<a;i++) {
	      b[i]=scan.nextInt();
		}
		Arrays.sort(b);
		for(int i=a-1;i>=0;i--) {
			if(i!=0) {
			System.out.print(b[i]+"->");
			}else System.out.print(b[i]);
		}
	}

}
