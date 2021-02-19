package beakjoon;
//2021.02.19
import java.util.Scanner;

public class Q2522 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int i = 1; i < num + 1; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= num - 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < num - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
