package java_ex100;

import java.util.Scanner;

public class ex100_73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int h = scanner.nextInt();

        int[] donations = new int[24];

        for (int i = 1; i <= 12; i++) {
            donations[2 * i - 2] = i;
            donations[2 * i - 1] = i * 10;
        }

        int totalDonation = donations[k - 1] + donations[h - 1];
        System.out.println(totalDonation);

        scanner.close();
    }
}
