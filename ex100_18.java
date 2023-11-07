package java_ex100;

import java.util.Scanner;

public class ex100_18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.next();
		
		char ch = str.charAt(0);
		
		int num = (int)ch;
		
		System.out.print(num);
		
		scanner.close();
		
		
	}

}
