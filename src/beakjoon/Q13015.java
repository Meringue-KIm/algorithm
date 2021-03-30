package beakjoon;
//2021.03.31
//풀이 해석중
import java.util.Scanner;

public class Q13015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nm = n - 1;
        int nmm = n - 2;
        int k = 0;
        // 상단
        for (int j = 0; j < n; j++) {
            System.out.print("*");
        }
        for (int j = 0; j < (2 * n) - 3; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < n; j++) {
            System.out.print("*");
        }
        System.out.println();
        // 몸통 (상단)
        for (int i = 0; i < nm; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < n - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < 2 * (n + 1) - k - 7; j++) {
                System.out.print(" ");
            }
            if (nm == i + 1) {
                System.out.print("");
                for (int j = 0; j < n - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            } else {
                System.out.print("*");
                for (int j = 0; j < n - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
                k += 2;
            }
        }
        System.out.println();
        // 몸통 (하단)
        for (int i = 0; i < nmm; i++) {
            for (int j = 0; j < nmm - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < n - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < (2 * i) + 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < n - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();

        }

        for (int j = 0; j < n; j++) {
            System.out.print("*");
        }
        for (int j = 0; j < (2 * n) - 3; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < n; j++) {
            System.out.print("*");
        }

    }
}