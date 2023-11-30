package java_ex100;

public class ex100_65 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0 || i % 6 == 0 || i % 9 == 0) {
                System.out.print("X ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}

