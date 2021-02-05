package beakjoon;
//2021.02.05
import java.util.Scanner;

public class Q2441 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < num; i++) {
            count++;
            for (int j = i + 1; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
            for (int j = 0; j < count; j++) {
                System.out.print(" ");
            }
        }
    }
}
