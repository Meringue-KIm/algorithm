package beakjoon;

import java.util.Scanner;

public class Q20492 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int num1 = N * 22 / 100;
        int num2 = N * 80 / 100;
        int num3 = N - num2;
        int num4 = num3 * 22 / 100;

        System.out.println((N - num1) + " " + (N - num4));
    }
}
