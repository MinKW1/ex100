package java_ex100;

import java.util.Scanner;

public class ex100_49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        int[] result = calculateTime(hour, minute);

        System.out.println(result[0] + " " + result[1]);

        scanner.close();
    }

    public static int[] calculateTime(int hour, int minute) {
        int[] result = new int[2];

        if (minute >= 30) {
            result[0] = hour;
            result[1] = minute - 30;
        } else {
            result[0] = (hour - 1 + 24) % 24;
            result[1] = minute + 30;
        }

        return result;
    }
}

