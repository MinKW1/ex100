package java_ex100;

import java.util.Scanner;

public class ex100_53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double sum1 = a + b;
        double sum2 = b + a;
        double sub1 = a - b;
        double sub2 = b - a;
        double mul1 = a * b;
        double mul2 = b * a;
        double div1 = a / b;
        double div2 = b / a;
        double pow1 = Math.pow(a, b);
        double pow2 = Math.pow(b, a);

        double max = sum1;

        if (sum2 > max) max = sum2;
        if (sub1 > max) max = sub1;
        if (sub2 > max) max = sub2;
        if (mul1 > max) max = mul1;
        if (mul2 > max) max = mul2;
        if (div1 > max) max = div1;
        if (div2 > max) max = div2;
        if (pow1 > max) max = pow1;
        if (pow2 > max) max = pow2;

        System.out.printf("%.6f", max);
        
        scanner.close();
    }
}
