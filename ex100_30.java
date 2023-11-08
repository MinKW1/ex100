package java_ex100;

import java.util.Scanner;

public class ex100_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		if(a<0)
			System.out.println("minus");
		else
			System.out.println("plus");
		if(a%2==0)
			System.out.print("even");
		else
			System.out.print("odd");
		
		scanner.close();
	}

}
