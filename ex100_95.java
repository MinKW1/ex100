package java_ex100;

import java.util.Scanner;

public class ex100_95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine().toLowerCase();

        int[] counts = new int[26];

        for (char ch : sentence.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                counts[ch - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            char currentChar = (char) ('a' + i);
            System.out.println(currentChar + ":" + counts[i]);
        }

        scanner.close();
    }
}

