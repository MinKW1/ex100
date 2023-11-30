package java_ex100;

import java.util.Scanner;

public class ex100_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		char ch = scanner.next().charAt(0);
		
		switch(ch) {
		case 'A':
			System.out.print("best!!!");
			break;
		case 'B':
			System.out.print("good!!");
			break;
		case 'C' : 
			System.out.print("run");
			break;
		case 'D' :
			System.out.print("slowly~");
			break;	
		}
		
		scanner.close();

	}

}
