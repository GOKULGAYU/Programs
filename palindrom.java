package ASDF;
import java.util.Scanner;
public class palindrom {
	public static void main(String[] args) {
		Scanner gk=new Scanner(System.in);
		String n=gk.next();
		String s;
		StringBuilder g=new StringBuilder(n);
		s=g.reverse().toString();
		if(n.equals(s)){System.out.println("Yes");
			
		}else System.out.println("No");
		
	}

}
