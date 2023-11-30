package java_ex100;

import java.util.Scanner;

public class ex100_48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int birthDate = scanner.nextInt();
        int gender = scanner.nextInt();

        int birthYear = getBirthYear(birthDate, gender);
        int age = calculateAge(birthYear);

        System.out.println(age);

        scanner.close();
    }

    public static int getBirthYear(int birthDate, int gender) {
        int baseYear;

        if (gender == 1 || gender == 2) {
            baseYear = 1900;
        } else {
            baseYear = 2000;
        }

        return baseYear + birthDate / 10000;
    }

    public static int calculateAge(int birthYear) {
        int currentYear = 2012;
        return currentYear - birthYear + 1;
    }
}

