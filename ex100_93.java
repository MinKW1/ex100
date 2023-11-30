package java_ex100;

import java.util.Scanner;

public class ex100_93 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        String[] words = new String[7];

        for (int i = 0; i < 7; i++) {
            words[i] = scanner.next();
        }

        Thread.sleep(3000);

        for (int i = 0; i < 7; i++) {
            System.out.print(words[i] + " ");
        }

        System.out.println();
        System.out.println("3");
        int k = scanner.nextInt();
        System.out.println(words[k - 1]);

        scanner.close();
    }
}
