package ASDF;
import java.util.Scanner;
public class b_subset_a {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();int count=0,sum=0;
		int y=scan.nextInt();
		int a[]=new int  [x];int b[]=new int  [y];
		for(int i=0;i<x;i++){
			a[i]=scan.nextInt();
		}for(int i=0;i<y;i++){
			b[i]=scan.nextInt();
		}
		
		for(int i=0;i<y;i++){
           for(int j=0;j<x;j++){
	if(b[i]==a[j]){count++;/*System.out.println("YES");break; */}else sum++;
              }
			
		}if(sum==(x*y)){
			System.out.println("NO");
		}else{System.out.println("YES");}

}
}