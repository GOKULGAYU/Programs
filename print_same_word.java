package practise;
import java.util.Scanner;
public class print_same_word {
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		String name=scan.nextLine();
		int num=scan.nextInt();
		for (int i=0;i<num;i++) {
			System.out.println(name);
		}
		
	}
}
