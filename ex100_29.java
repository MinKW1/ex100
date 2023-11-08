package java_ex100;
import java.util.Scanner;

public class ex100_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(a%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
		if(b%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
		if(c%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
		
		scanner.close();

	}

}
