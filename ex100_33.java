package java_ex100;

import java.util.Scanner;

public class ex100_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int month = scanner.nextInt();
		
		switch(month) {
		
		case 12 :
		case 1 :
		case 2 :
			System.out.print("winter");
			break;
		case 3:
		case 4:
		case 5:
			System.out.print("spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.print("summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.print("fall");
			break;
		
		}
		
		scanner.close();

	}

}
