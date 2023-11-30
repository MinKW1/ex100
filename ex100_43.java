package java_ex100;

import java.util.Scanner;

public class ex100_43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수 입력
        int n = scanner.nextInt();

        // 정수를 한글로 변환하여 출력
        System.out.println(numberToKorean(n));

        // Scanner 닫기
        scanner.close();
    }

    public static String numberToKorean(int n) {
        if (n == 0) {
            return "영";
        }

        String[] unit1 = {"", "십", "백", "천"};
        String[] unit2 = {"", "만", "억", "조"};

        StringBuilder result = new StringBuilder();

        int unitIndex = 0;
        boolean hasDigit = false;

        while (n > 0) {
            int digit = n % 10;
            if (digit > 0) {
                result.insert(0, unit2[unitIndex]);
                result.insert(0, unit1[unitIndex % 4] + digit);
                hasDigit = true;
            } else {
                if (hasDigit) {
                    hasDigit = false;
                    result.insert(0, "영");
                }
            }

            n /= 10;
            unitIndex++;

            if (unitIndex == unit2.length) {
                break;
            }
        }

        return result.toString();
    }
}
