package java_ex100;

import java.util.Scanner;

public class ex100_44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		var num = scanner.nextInt();
		
		switch(num) {
		case 1:
		case 3:
		case 5:
		case 7:
			System.out.print("oh my god");
			break;
		case 2:
		case 4:
		case 6:
			System.out.print("enjoy");
			break;
		}
		
		scanner.close();

	}

}
