package ASDF;
import java.util.Scanner;
public class Holiday {
	public static void main(String[] args) {
		Scanner gk=new Scanner(System.in);
		String s=gk.next();
		if(s.equals("saturday")|| s.equals("sunday")){
			System.out.println("Yes");
		}else{System.out.println("No");}
	}

}
