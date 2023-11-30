package java_ex100;
import java.util.Scanner;

public class ex100_60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 터널 높이 입력
        int tunnelA = scanner.nextInt();
        int tunnelB = scanner.nextInt();
        int tunnelC = scanner.nextInt();

        // 차의 높이
        int carHeight = 170;

        // 터널 통과 여부 확인
        if (tunnelA <= carHeight) {
            System.out.println("CRASH " + tunnelA);
        } else if (tunnelB <= carHeight) {
            System.out.println("CRASH " + tunnelB);
        } else if (tunnelC <= carHeight) {
            System.out.println("CRASH " + tunnelC);
        } else {
            System.out.println("PASS");
        }
        scanner.close();
    }
    
}
