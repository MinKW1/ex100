package java_ex100;

import java.util.Scanner;

public class ex100_61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 정수 입력
        int num1 = scanner.nextInt();

        // 연산자 입력
        String operator = scanner.next();

        // 두 번째 정수 입력
        int num2 = scanner.nextInt();

        // 결과 계산 및 출력
        switch (operator) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                if (num2 != 0) {
                    double result = (double) num1 / num2;
                    System.out.printf("%.2f\n", result);
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                break;
            default:
                System.out.println("올바른 연산자를 입력하세요.");
        }
        scanner.close();
    }
}

