package ASDF;
import java.util.*;
public class MAXNUM {
public static void main(String []args) {
	Scanner gk=new Scanner(System.in);
	int a=gk.nextInt();
	int b[]=new int[a];
	for (int i=0;i<a;i++) {
		b[i]=gk.nextInt();
	}
	int c=b[0];
	for (int i=0;i<a;i++) {
		if (c<b[i]) c=b[i];
	}
	System.out.println(c);
}
	
}
