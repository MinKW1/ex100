package java_ex100;

import java.util.Random;
import java.util.Scanner;

public class ex100_100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int answer = random.nextInt(100) + 1;
        int guess;

        do {
            System.out.print("번호를 입력하세요: ");
            guess = scanner.nextInt();

            if (guess > answer) {
                System.out.println("번호가 정답보다 큽니다.");
            } else if (guess < answer) {
                System.out.println("번호가 정답보다 작습니다.");
            }
        } while (guess != answer);

        System.out.println("정답입니다.");

        scanner.close();
    }
}
