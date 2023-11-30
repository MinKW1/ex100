package java_ex100;

import java.util.Scanner;

public class ex100_39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 세 정수 입력
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // 가장 작은 수 출력
        int minNum = Math.min(Math.min(num1, num2), num3);
        System.out.println(minNum);

        // Scanner 닫기
        scanner.close();
    }
}

