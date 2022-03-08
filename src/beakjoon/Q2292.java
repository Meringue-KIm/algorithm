package beakjoon;

import java.util.Scanner;

public class Q2292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 1;
        int num = 2;

        if (n == 1) {
            System.out.println(1);
        } else {
            while (num <= n) {
                num += (6 * count);
                count++;
            }
            System.out.println(count);
        }
    }

}
