package java_ex100;

import java.util.Scanner;

public class ex100_64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = a % b;

        System.out.println(result);

        scanner.close();
    }
}

