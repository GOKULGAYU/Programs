package newExamples;
import java.util.Scanner;
public class reverse {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
	     String s=scan.nextLine();
	     StringBuilder sb=new StringBuilder(s);
	     sb.reverse();
	     if (s.equals(sb.toString())) {
	    	 System.out.println(s);
	     }else { System.out.print("NO");}
	
	}

}
