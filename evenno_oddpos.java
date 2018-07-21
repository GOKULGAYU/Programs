package ASDF;
import java.util.Scanner;
public class evenno_oddpos {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b[]=new int [a];
	for(int i=0;i<a;i++){
		b[i]=scan.nextInt();
		if(i%2==0){if(b[i]%2==1){System.out.print(b[i]);}}
		if(i%2==1){if(b[i]%2==0){System.out.print(b[i]);}}
		}
}
}
