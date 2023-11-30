package java_ex100;

import java.util.Scanner;

public class ex100_42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int len = scanner.nextInt();
		
		if(len >= 50 && len <=70)
			System.out.print("win");
		else if(len % 6 == 0)
			System.out.print("win");
		else
			System.out.print("lose");
		
		scanner.close();
		

	}

}
