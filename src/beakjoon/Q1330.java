package beakjoon;

import java.util.Scanner;

// 2021.01.04
// 두 수 비교하기
public class Q1330 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a > b) {
            System.out.println(">");
        } else if (a == b) {
            System.out.println("==");
        } else {
            System.out.println("<");
        }
    }
}
