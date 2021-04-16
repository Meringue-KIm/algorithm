package beakjoon;

import java.util.Scanner;

public class Q10871_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (x > num) {
                System.out.print(num);
                System.out.print(" ");
            } else {
                continue;
            }
        }
    }
}
