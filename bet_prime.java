package ASDF;

import java.util.Scanner;

public class bet_prime {
	public static void main(String[] args) {
		Scanner gk=new Scanner(System.in);
		int a=gk.nextInt();
		int b=gk.nextInt();
		int count=0;
		for(int i=a;i<b;i++){
			for(int j=2;j<a;j++){
				if(i%j==0){
					count++;
					break;
				}
			}if(count==0){System.out.print(i+" ");}count=0;
			
		}
	}

}
