package java_ex100;

import java.util.Scanner;

public class ex100_78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;
        int operand = scanner.nextInt();
        char operator = ' ';

        while (true) {
            if (operator == '=') {
                break;
            }

            int nextOperand = scanner.nextInt();
            operator = scanner.next().charAt(0);

            switch (operator) {
                case '+':
                    result = operand + nextOperand;
                    break;
                case '-':
                    result = operand - nextOperand;
                    break;
                case '*':
                    result = operand * nextOperand;
                    break;
                case '/':
                    result = operand / nextOperand;
                    break;
            }

            operand = result;
            System.out.println(result);
        }

        scanner.close();
    }
}
