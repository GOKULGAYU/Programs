package ASDF;
import java.util.Scanner;
public class sum_natural {
	 public static void main(String[] args) {
		Scanner gk=new Scanner(System.in);
		int N=gk.nextInt();
		int sum=0;
		for(int i=1;i<=N;i++){
			sum=sum+i;
		}System.out.println(sum);
	}

}
