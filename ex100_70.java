package java_ex100;

import java.util.Scanner;

public class ex100_70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int r = scanner.nextInt();  
        int n = scanner.nextInt(); 

        int result = a;

        for (int i = 1; i < n; i++) {
            result *= r;
        }

        System.out.println(result);

        scanner.close();
    }
}
