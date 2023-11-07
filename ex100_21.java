package java_ex100;
import java.util.Scanner;


public class ex100_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int mult = (int)Math.pow(2, b);
		
		System.out.print(a*mult);
		
		scanner.close();

	}

}
