import java.util.Scanner;

public class POSITIVE_NO {
public static void main(String[] args) {
	Scanner gk=new  Scanner(System.in);
	int a=gk.nextInt();
	if(a<0){
		System.out.println("Negative");
	}else if(a==0){System.out.println("Zero");
		}else System.out.println("Positive");
}
}
