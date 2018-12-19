package gokulukog;

import java.util.Scanner;

public class middlesort {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();int c=0;
		int b[]=new int [a];int temp=0;
		for(int i=0;i<a;i++) {
			b[i]=scan.nextInt();
			}
		for(int i=0;i<a;i++) {
			for(int j=i+1;j<a;j++) {
				if(b[i]>b[j]) {
					temp=b[i];b[i]=b[j];b[j]=temp;
				}
			}
		}
		if(a/2==0) {
		System.out.println(b[a/2-1]);}
		else {
			System.out.println(b[a/2]);
		}
	}

}
