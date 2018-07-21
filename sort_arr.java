package ASDF;
import java.util.Arrays;
import java.util.Scanner;
public class sort_arr {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();int sum=0,sub=0;
		int b[]=new int [a];int count=1;
		for(int i=0;i<a;i++){
			b[i]=scan.nextInt();
			}if(b[0]==b[1]){
			for(int i=1;i<a;i++){
				if(b[i-1]==b[i]){
					count++;
				}else break;
			}
			}Arrays.sort(b);
			if(count==a){System.out.println(b[0]);}
			else{
				for(int i=a-1;i>=0;i--){
					System.out.print(b[i]+" ");
				}
			}
	}
		
	

}
