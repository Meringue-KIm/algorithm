package beakjoon;
//2021.02.20
import java.util.Scanner;

public class Q2444 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        int num1 = 1;

        for (int i = 1; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < num1; j++) {
                System.out.print("*");
            }
            num1 = num1 + 2;
            System.out.println();
        }
        for (int i = 0; i < 2 * num - 1; i++) {
            System.out.print("*");
        }
        System.out.println();
        int num2 = 2 * num - 1;

        for (int i = 1; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            num2 = num2 - 2;
            for (int j = 0; j < num2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
