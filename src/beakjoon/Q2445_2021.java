package beakjoon;

import java.util.Scanner;

public class Q2445_2021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int count = 2;

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < num * 2 - count; j++) {
                System.out.print(" ");
            }
            count += 2;
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        count = 2;
        for (int i = 1; i <= num - 1; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < count; j++) {
                System.out.print(" ");
            }
            count += 2;

            for (int j = 0; j < num - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
