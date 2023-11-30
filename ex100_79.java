package java_ex100;

import java.util.Scanner;

public class ex100_79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (Character.isUpperCase(ch)) {
                System.out.print(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                System.out.print(Character.toUpperCase(ch));
            } else {
                System.out.print(ch);
            }
        }

        scanner.close();
    }
}
