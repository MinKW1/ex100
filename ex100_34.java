package java_ex100;

import java.util.Scanner;

public class ex100_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int num = scanner.nextInt();
			System.out.println(num);
			if(num == 0)
				break;
		}
		scanner.close();

	}

}
