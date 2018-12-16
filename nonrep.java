package gokulukog;
import java.util.Scanner;
public class nonrep {
	public static void main(String args[]) {
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int count=0,num=0;
int b[]=new int [a];
for(int i=0;i<a;i++) {
	b[i]=scan.nextInt();
}
for(int i=0;i<a;i++) {
	for(int j=0;j<a;j++) {
		if (b[i]==b[j]) {
			count++;
		}
	}if (count==1) {
		num=b[i];
	}count=0;
}
System.out.println(num);
}
}