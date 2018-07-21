package ASDF;
import java.util.Scanner;
public class sum_pos_neg_zero {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b[]=new int [a];
		for(int i=0;i<a;i++){
			b[i]=scan.nextInt();
			}
		for(int i=0;i<a-1;i++){
			for(int j=i+1;j<a;j++){
				if(b[i]+b[j]==0){
					System.out.print(b[i]+" "+b[j]+" ");
				}
			}
		}
	}

}
