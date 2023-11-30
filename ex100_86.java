package java_ex100;

import java.util.Scanner;

public class ex100_86 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     int n = scanner.nextInt();

     for (int i = 1; i <= n; i++) {
         for (int j = 1; j <= n - i; j++) {
             System.out.print(" ");
         }
         for (int k = 1; k <= 2 * i - 1; k++) {
             System.out.print("*");
         }
         System.out.println();
     }

     for (int i = n - 1; i >= 1; i--) {
         for (int j = 1; j <= n - i; j++) {
             System.out.print(" ");
         }
         for (int k = 1; k <= 2 * i - 1; k++) {
             System.out.print("*");
         }
         System.out.println();
     }

     scanner.close();
 }
}

