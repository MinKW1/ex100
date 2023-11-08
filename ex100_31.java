package java_ex100;
import java.util.Scanner;

public class ex100_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		
		if(score >=90)
			System.out.println("A");
		else if(70<= score && score <= 89)
			System.out.println("B");
		else if(40 <= score && score <= 69)
			System.out.println("C");
		else if(0 <= score && score <= 39)
			System.out.println("D");
		
		scanner.close();

	}

}
