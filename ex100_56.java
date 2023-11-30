package java_ex100;

import java.util.Scanner;

public class ex100_56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countFlipped = 0;

        for (int i = 0; i < 4; i++) {
            int state = scanner.nextInt();
            if (state == 1) {
                countFlipped++;
            }
        }

        scanner.close();

        switch (countFlipped) {
            case 0:
                System.out.println("모");
                break;
            case 1:
                System.out.println("도");
                break;
            case 2:
                System.out.println("개");
                break;
            case 3:
                System.out.println("걸");
                break;
            case 4:
                System.out.println("윷");
                break;
        }
    }
}
