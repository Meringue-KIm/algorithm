package beakjoon;

import java.util.Scanner;

// 2021.01.04
// 곱셈
public class Q2588 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int result = a * b;

        int first = b / 100;
        b %= 100;
        int second = b / 10;
        b = b % 10;
        int third = b;

        System.out.println(a * third);
        System.out.println(a * second);
        System.out.println(a * first);
        System.out.println(result);
    }
}
