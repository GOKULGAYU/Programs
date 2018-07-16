package ASDF;
import java.util.Scanner;
public class swap_odd_even {
	public static void main(String[] args) {
   Scanner gk=new Scanner(System.in);
   String s=gk.next();
   StringBuilder d=new StringBuilder(s.substring(0,2));
   StringBuilder e=new StringBuilder(s.substring(2,4));
   String g=(d.reverse()).toString();
   g=g+(e.reverse()).toString();
   System.out.println(g);
	}

}
