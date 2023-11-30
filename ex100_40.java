package java_ex100;

import java.util.Scanner;

public class ex100_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner(System.in);
		
		float length = scanner.nextFloat();
		
		if(length >= 50 && length <= 60)
			System.out.print("win");
		else
			System.out.print("lose");
		
		scanner.close();
	}

}
