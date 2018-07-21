package ASDF;
import java.util.Scanner;
public class Strin_prefix {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int z=scan.nextInt();int count=0,k; 
		String a[]=new String[z];int y=0;
		for(int i=0;i<z;i++){
			a[i]=scan.next();
			}   int d=a[0].length();   
		    for(int i=1;i<a.length;i++){
		    	if(d>a[i].length()){d=a[i].length();}
		    }
			for( k=0;k<d;k++){
			if(y==0){
		for(int i=0;i<z-1;i++){
			if(a[i].charAt(k)==a[i+1].charAt(k)){
				count++;
				}else{y++;break ;}
		}}
		else {break;}
		}
			if(count==d*(z-1)){
		for(int i=0;i<d;i++){
			System.out.print(a[0].charAt(i));
			
		}
		}else {
			for(int i=0;i<k-1;i++){
				System.out.print(a[0].charAt(i));
				
			
		}
		}}
	

}