package gokulukog;
import java.util.Scanner;
public class firsrepeat {
 public static void main(String args[]) {
	 Scanner scan=new Scanner(System.in);
	 int a=scan.nextInt();
	 int count =0,num=0;
	 int b[]=new int [a];
	 for(int i=0;i<a;i++) {
		 b[i]=scan.nextInt();
	 }
	 for(int i=0;i<a;i++) {
		 for(int j=i+1;j<a;j++) {
			 if(b[i]==b[j]) {
				 if (count==0) {
				 count++;num=b[j];}
				 
			 }
		 }
	 }
	 if (count==0) {
	System.out.println("Unique");	 
	 }else {
		 System.out.println(num);
	 }
 }
}
