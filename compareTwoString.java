package practise;
import java.util.Scanner;
public class compareTwoString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String name1=scan.nextLine();
		String name2=scan.nextLine();
		int a=name1.length();
		int b=name2.length();
		if (a>b) {
			System.out.println(name1);
		}else {
			System.out.println(name2);
		}

	}

}
