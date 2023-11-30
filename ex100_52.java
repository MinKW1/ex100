package java_ex100;

import java.util.Scanner;

public class ex100_52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String ordinalNumber = getEnglishOrdinalNumber(number);
        System.out.println(ordinalNumber);
        
        scanner.close();
    }


    private static String getEnglishOrdinalNumber(int number) {
        if (number == 11 || number == 12 || number == 13) {
            return number + "th";
        }

        int lastDigit = number % 10;
        String suffix;

        switch (lastDigit) {
            case 1:
                suffix = "st";
                break;
            case 2:
                suffix = "nd";
                break;
            case 3:
                suffix = "rd";
                break;
            default:
                suffix = "th";
        }

        return number + suffix;
    }
}
