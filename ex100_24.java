package java_ex100;

import java.util.Scanner;

public class ex100_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if(b>=a)
			System.out.print("1");
		else
			System.out.print("0");
		
		scanner.close();

	}

}
