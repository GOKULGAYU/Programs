package ASDF;
import java.util.Scanner;
public class factorial {
public static void main(String[] args) {
	Scanner gk=new Scanner(System.in);
	int a=gk.nextInt();int count=1;
	for(int i=1;i<=a;i++){
		count=count*i;
	}System.out.println(count);
} 

}
