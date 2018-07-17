package ASDF;
import java.util.Scanner;
public class isomarpic {
public static void main(String[] args) {
	Scanner gk=new Scanner(System.in);
	String a=gk.next();int count=0,sum=0;
	String b=gk.next();
	if(a.length()==b.length()){
		for(int i=0;i<a.length()-1;i++){
			if(String.valueOf(a.charAt(i))!="*"){
			for(int j=i+1;j<a.length();j++){
				if(a.charAt(i)==a.charAt(j)){
					if(b.charAt(i)==b.charAt(j)){
						sum=sum+2;
						a=a.replace(String.valueOf(a.charAt(i)),"*");
					}else System.out.println("it is not an isomorphic");break;
				}else count++;
				
			}if(count==a.length()){System.out.println("it is isomorphic word");}
			}
	if(sum+count==a.length()){
	System.out.println("it is isomorphic word");
	count=0;sum=0;	
	}
	}
	}else System.out.println("it is not an isomorphic");
}
}
