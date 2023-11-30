package java_ex100;

import java.util.Scanner;

public class ex100_63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 일(day) 입력
        int day = scanner.nextInt();

        // 시간으로 변환하여 출력
        int hours = day * 24;
        System.out.println(hours);
        scanner.close();
    }
}
