package java_ex100;

import java.util.Arrays;
import java.util.Scanner;

public class ex100_59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 로또 당첨 번호 입력
        int[] winningNumbers = new int[6];
        for (int i = 0; i < 6; i++) {
            winningNumbers[i] = scanner.nextInt();
        }
        // 보너스 번호 입력
        int bonusNumber = scanner.nextInt();

        // 주희가 가지고 있는 로또 번호 입력
        int[] userNumbers = new int[6];
        for (int i = 0; i < 6; i++) {
            userNumbers[i] = scanner.nextInt();
        }

        // 로또 번호 정렬
        Arrays.sort(winningNumbers);
        Arrays.sort(userNumbers);

        // 일치하는 번호 개수 확인
        int matchingNumbers = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (userNumbers[i] == winningNumbers[j]) {
                    matchingNumbers++;
                    break;
                }
            }
        }

        // 보너스 번호 일치 확인
        boolean bonusNumberMatch = false;
        for (int i = 0; i < 6; i++) {
            if (userNumbers[i] == bonusNumber) {
                bonusNumberMatch = true;
                break;
            }
        }

        // 결과 출력
        if (matchingNumbers == 6) {
            System.out.println("1");
        } else if (matchingNumbers == 5 && bonusNumberMatch) {
            System.out.println("2");
        } else if (matchingNumbers == 5) {
            System.out.println("3");
        } else if (matchingNumbers == 4) {
            System.out.println("4");
        } else if (matchingNumbers == 3) {
            System.out.println("5");
        } else {
            System.out.println("0 꽝!");
        }
        scanner.close();
    }
}
