package ASDF;
import java.util.Scanner;
public class Repeat_order {
public static void main(String[] args) {
	Scanner gk=new Scanner(System.in);
	int a=gk.nextInt();
	int b[]=new int[a];int count=0;
	for(int i=0;i<a;i++){
		b[i]=gk.nextInt();
	}for(int i=0;i<a-1;i++){
		for(int j=i+1;j<a;j++){
			if(b[i]==b[j]){
				System.out.println(b[i]+" ");count++;break;
			}
			
		}
	}if (count==0){
		System.out.println("unique");
	}
}
}
