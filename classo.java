package projectnew;
import java.util.Scanner;
public class classo {
	public static void main(String arge[]){
		String s="fiber:filer:fixer:fever:filter";
		String a[]=s.split(":");String a1[]=s.split(":");String g="";int count=0;
		Scanner gk= new Scanner(System.in);
		String b=gk.next();
		String c[]=b.split("_");
		for(int j=0;j<c.length;j++){
		g=g+c[j];}		
		for(int i=0;i<a.length;i++){
		a[i]=a[i].substring(0,c[0].length())+a[i].substring(c[0].length()+1);
		if(a[i].equals(g)){
			count++;
			System.out.println(a1[i]);
		}
		}if(count==0){System.out.println("ERROR");}}}
