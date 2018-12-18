package gokulukog;
import java.util.Scanner;
public class reverserepeate {
 public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	
	String input="Gokul raj keerthika";
	String output1="";
	String b[]=input.split(" ");
	System.out.println(b.length);
	for(int j=0;j<b.length;j++) {
		
		for(int i=b[j].length();i>0;i--) {
			
			output1+=input.substring(i-1,i);
			
		}
		System.out.println(output1);output1="";
	}
 }
}
