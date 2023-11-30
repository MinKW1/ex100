package java_ex100;

import java.util.Scanner;

public class ex100_96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 1000; j++) {
                System.out.print(i * j + " ");
                if (j % 10 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
