package ASDF;

import java.util.Arrays;
import java.util.Scanner;

public class Repete_one {
	public static void main(String[] args) {
		Scanner gk = new Scanner(System.in);
		int a = gk.nextInt();
		int b[] = new int[a];int f[]=new int[a];
		int count = 0;
		for (int i = 0; i < a; i++) {
			b[i] = gk.nextInt();
		}
		for (int g=0, i = 0; i < a-1; i++) {
			for (int j = i+1; j < a; j++) {
				if (b[i] == b[j]) {
					f[g]=b[i];g++;
					break;
				}else count++;
			}
		}Arrays.sort(f);
		for(int i=0;i<f.length;i++){
			if(f[i]>0){
			System.out.print(f[i]+" ");}
			
		}

	}
}
