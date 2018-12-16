package gokulukog;

import java.util.Scanner;

public class ccccc {
	public static void main(String[]args ) {
		  Scanner scan=new Scanner(System.in);
		  int a=scan.nextInt();
		  int b[]=new int[a];
		  int c[]=new int [a/2];
		  for (int i=0;i<a;i++) {
			  b[i]=scan.nextInt();
		  }
		  for(int k=0,i=0;i<a;i++) {
			  for (int j=i+1;j<a;j++) {
				  if(b[i]==b[j]) {
					System.out.print(b[j]+" ");  
				  }
			  }
		  }
		  
	 }

}
