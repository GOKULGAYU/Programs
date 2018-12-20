package gokulukog;
import java.util.Scanner;
public class min_to_hour {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		if(a<60) {
			System.out.println(a);
		}else {
			System.out.print(a/60+" ");
			System.out.print(a%60);
		}

	}

}
