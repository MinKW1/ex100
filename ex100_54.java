package java_ex100;

import java.util.Scanner;

public class ex100_54 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b % a == 0) {
            int x = b / a;
            System.out.printf("%d*%d=%d", a, x, b);
        } else if (a % b == 0) {
            int x = a / b;
            System.out.printf("%d*%d=%d", b, x, a);
        } else {
            System.out.println("none");
        }
        scanner.close();
    }

}
