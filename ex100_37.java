package java_ex100;

import java.util.Scanner;

public class ex100_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int width = scanner.nextInt();
		int height = scanner.nextInt();
		float area;
		area = (float)(width*height)/2;
		System.out.printf("%.1f", area);
		
		scanner.close();

	}

}
