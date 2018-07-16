package ASDF;
import java.util.Scanner;
public class prime {
	public static void main(String[] args) {
		Scanner gk=new Scanner(System.in);
		int a=gk.nextInt();int count=0;
		for(int i=2;i<a;i++){
			if(a%i==0){
				System.out.println("No");count++;
				break;
			}
		}if(count==0)System.out.println("Yes");
		
	}

}
