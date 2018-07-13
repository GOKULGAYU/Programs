import java.util.Scanner;

public class Alphabet {
	public static void main(String[] args) {
		Scanner gk=new Scanner(System.in);
		char vo;
		vo=gk.next().charAt(0);
		if(vo>=65 && vo<=90 || vo>=97 && vo<=122){
			
				System.out.println("Alphabet");
			}else {
				System.out.println("No");
		}
	}

}
