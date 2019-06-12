package gidHub;
import java.util.Scanner;
public class reveElimnatePalin {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		String name=scan.next();
		StringBuilder sb=new StringBuilder(name);
		sb.reverse();int l=name.length();
		if (name.equals(sb.toString())) {
			System.out.print(name.substring(0,l-1));
		}else System.out.print(name);
	}
	

}
