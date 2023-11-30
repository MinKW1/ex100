package java_ex100;

import java.util.Scanner;

public class ex100_80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cipherText = scanner.nextLine();

        for (int i = 0; i < cipherText.length(); i++) {
            char ch = cipherText.charAt(i);
            if (Character.isUpperCase(ch)) {
                char decryptedChar = (char) ('A' + (ch - 'A' + 23) % 26);
                System.out.print(decryptedChar);
            } else if (Character.isLowerCase(ch)) {
                char decryptedChar = (char) ('a' + (ch - 'a' + 23) % 26);
                System.out.print(decryptedChar);
            } else {
                System.out.print(ch);
            }
        }

        scanner.close();
    }
}


