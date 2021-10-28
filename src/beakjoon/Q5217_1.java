package beakjoon;
//2021.10.28
//재풀이
import java.util.Scanner;

public class Q5217_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int count = 0;

            System.out.print("Pairs for " + n + ":");

            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (count == 0 && j + k == n && j < k) {
                        System.out.print(" " + j + " " + k);
                        count++;
                    } else if (j + k == n && j < k) {
                        System.out.print(", " + j + " " + k);
                    }
                }
            }
            System.out.println();
        }
    }
}
