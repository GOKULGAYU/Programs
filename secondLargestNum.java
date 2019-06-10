package practise;
import java.util.Arrays;
import java.util.Scanner;
public class secondLargestNum {

	public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 int N=scan.nextInt();
	 int nu[]=new int[N];
	 int K=scan.nextInt();
	 for (int i=0;i<N;i++) {
		 
		 nu[i]=scan.nextInt();
		 
	 }
	 Arrays.sort(nu);
	 System.out.println(nu[N-2]);

	}

}
