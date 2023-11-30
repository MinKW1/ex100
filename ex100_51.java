package java_ex100;

import java.util.Scanner;

public class ex100_51 {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int compressedAmount = compressTrashBin(n);
        System.out.println(compressedAmount);

        if (compressedAmount <= 50) {
            System.out.println("GOOD");
        } else {
            System.out.println("OH MY GOD");
        }
        
        scanner.close();
    }


    private static int compressTrashBin(int n) {

        int compressedValue = (n % 10) * 10 + (n / 10) * 2;

        if (compressedValue >= 100) {
            compressedValue %= 100;
        }

        return compressedValue;
    }
}