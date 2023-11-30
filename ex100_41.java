package java_ex100;

import java.util.Scanner;

public class ex100_41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int length = scanner.nextInt();
		
		if(length >= 30 && length <= 40)
			System.out.print("win");
		else if(length>=60 && length <= 70)
				System.out.print("win");	
		else
			System.out.print("lose");
		
		scanner.close();

	}

}
