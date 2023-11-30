package java_ex100;

import java.util.Scanner;

public class ex100_45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        solveQuadraticEquation(a, b, c);

        scanner.close();
    }

    public static void solveQuadraticEquation(int a, int b, int c) {
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.printf("방정식의 해는 %.2f\n방정식의 해는 %.2f\n", root1, root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.printf("방정식의 해는 %.2f\n", root);
        } else {
            System.out.println("실근이 없습니다.");
        }
    }
}
