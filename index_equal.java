package ASDF;
import java.util.Arrays;
import java.util.Scanner;
public class index_equal {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();int sum=0,sub=0;
		int b[]=new int [a];int count=1;
		int c[]=new int [a];
		for(int i=0;i<a;i++){
			b[i]=scan.nextInt();
			if(b[i]==i){c[i]=b[i];}
		}
		Arrays.sort(c);
for(int i=0;i<a;i++){
	if(c[i]!=0){System.out.print(c[i]+" ");}
}
		
	}

}
