package java_ex100;

import java.util.Scanner;

public class ex100_62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 학년, 반, 번호 입력
        int grade = scanner.nextInt();
        int classNum = scanner.nextInt();
        int number = scanner.nextInt();

        // 출력 형식에 맞게 문자열 생성
        String formattedGrade = String.format("%01d", grade);
        String formattedClassNum = String.format("%02d", classNum);
        String formattedNumber = String.format("%03d", number);

        // 학번 출력
        System.out.println(formattedGrade + formattedClassNum + formattedNumber);
        scanner.close();
    }
    
}

