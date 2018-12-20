package gokulukog;
import java.util.Scanner;
public class countwithoutspace {
public static void main(String []args) {
	Scanner scan=new Scanner(System.in);
	String input=scan.next();int count=0;
    String b[]=input.split(" ");
    for(int i=0;i<b.length;i++) {
    	count+=b[i].length();
    }
	System.out.println(count);
}
}
