package beakjoon;
//2021.02.18
import java.util.Scanner;

public class Q10992 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - i - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        if (n != 1) {
            for (int i = 0; i < 2 * n - 1; i++) {
                System.out.print("*");
            }
        }
    }
}

