package ASDF;
import java.util.Scanner;
public class sum_square {
public static void main(String[] args) {
	Scanner gk=new Scanner(System.in);
	int sum=0,c=0;
	int a=gk.nextInt();
	while(a>9){
	 c=a%10;
		sum=sum+(c*c);a=a/10;c=0;
	}sum=sum+(a*a);
	System.out.println(sum);
	
}
}
