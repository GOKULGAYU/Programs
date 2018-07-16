package ASDF;

import java.util.Scanner;

public class no_reverse {
	public static void main(String[] args) {
		Scanner gk=new Scanner(System.in);
		String n=gk.next();
		String s;
		StringBuilder g=new StringBuilder(n);
		s=g.reverse().toString();System.out.println(s);
	}
}
