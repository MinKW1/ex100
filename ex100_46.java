package java_ex100;

import java.util.Scanner;

public class ex100_46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tunnel1 = scanner.nextInt();
        int tunnel2 = scanner.nextInt();
        int tunnel3 = scanner.nextInt();

        checkTunnel(tunnel1);
        checkTunnel(tunnel2);
        checkTunnel(tunnel3);

        scanner.close();
    }

    public static void checkTunnel(int height) {
        if (height <= 170) {
            System.out.println("CRASH");
        } else {
            System.out.println("PASS");
        }
    }
}

