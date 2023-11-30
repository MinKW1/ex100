package java_ex100;

import java.util.Scanner;

public class ex100_77 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        while (n != 0) {
            System.out.println(n);
            n--;
        }

        scanner.close();
    }
}

