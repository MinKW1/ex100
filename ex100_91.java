package java_ex100;

import java.util.Scanner;

public class ex100_91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(numbers[(i + j) % n] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

