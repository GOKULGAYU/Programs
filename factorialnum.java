package ASDF;
import java.util.Scanner;
public class factorialnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scan = new Scanner (System .in);
   int a = scan .nextInt(),out=1;
   for (int i=1; i<=a;i++){
	   out=out*i;
   }System.out.println(out);
	}
}

