package beakjoon;
//2021.02.19
import java.util.Scanner;

public class Q2442 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N - i; j++)
                System.out.print(" ");
            for (int j = 0; j < i * 2 - 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

