package ASDF;

import java.util.Scanner;

public class array_sum {
	public static void main(String[] args) {
		Scanner gk = new Scanner(System.in);
		int a = gk.nextInt(), sum = 0;
		int b = gk.nextInt();
		int c[] = new int[a];
		for (int i = 0; i < c.length; i++) {
			c[i] = gk.nextInt();
		}
		for (int i = 0; i <b; i++) {
			sum = sum + c[i];
		}System.out.println(sum);

	}

}
