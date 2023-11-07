package java_ex100;

import java.util.Scanner;

public class ex100_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int sum = a + b + c;
		float avr = sum/3;
		
		System.out.println(sum);
		System.out.printf("%.1f", avr);
		
		scanner.close();
		

	}

}
