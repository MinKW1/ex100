package java_ex100;

import java.util.Scanner;


public class ex100_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int sum = 0;
		
		for(int i=1; i <= num; i++) {
			if(i%2==0)
				sum += i;
		}
		System.out.print(sum);
		
		scanner.close();

	}

}
