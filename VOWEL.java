import java.util.Scanner;

public class VOWEL {
public static void main(String[] args) {
	Scanner gk=new Scanner(System.in);
	char vo;
	vo=gk.next().charAt(0);
	if(vo>=65 && vo<=90 || vo>=97 && vo<=122){
		if(vo=='a' || vo=='A'|| vo=='e' || vo=='E' ||vo=='i' ||vo=='I' ||vo=='o' ||vo=='O' ||vo=='u' ||vo=='U' ){
			System.out.println("Vowels");
		}else {
			System.out.println("Consonant");
	}
}else System.out.println("Invalid");
}
}