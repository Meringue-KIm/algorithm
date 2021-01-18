package beakjoon;

import java.util.Scanner;
//2021.01.18
//윤년 재풀이
public class Q2753_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
