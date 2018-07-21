package ASDF;
import java.util.Scanner;
public class add_pos_neg {
public static void main(String[] args){
	Scanner gk=new Scanner(System.in);
	int a=gk.nextInt();int sum=0,sub=0;
	int b[]=new int [a];
	for(int i=0;i<a;i++){
		b[i]=gk.nextInt();
		if(b[i]>0){sum=sum+b[i];}
		else{sub=sub+b[i];}
	}sum=sum+sub;
	System.out.println(sum);
}
	
}
