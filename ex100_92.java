package java_ex100;

import java.util.Scanner;

public class ex100_92 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        Thread.sleep(3000);

        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println("3번째 숫자는?");
        int k = scanner.nextInt();
        System.out.println(numbers[k - 1]);

        scanner.close();
    }
}
