package java_ex100;

import java.util.Scanner;

public class ex100_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int dice1 = scanner.nextInt();
		int dice2 = scanner.nextInt();
		
		for(int i = 1; i <= dice1; i++) {
			for(int j = 1; j <= dice2; j++) {
				System.out.println(i + " " + j);
			}
		}

		scanner.close();
	}

}
