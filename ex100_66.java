package java_ex100;

import java.util.Scanner;

public class ex100_66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;
        int i;

        for (i = 1; ; i++) {
            sum += i;

            if (sum >= n) {
                break;
            }
        }

        System.out.println(sum);

        scanner.close();
    }
}

