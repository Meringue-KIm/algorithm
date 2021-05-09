package beakjoon;
//2021.05.09
//연습
import java.util.Scanner;

public class Q2441__1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= N - i; j++) {
                System.out.print("*");
            }
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
        }
    }
}
