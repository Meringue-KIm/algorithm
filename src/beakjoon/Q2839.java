package beakjoon;

import java.util.Scanner;
// 다 못풀었음
public class Q2839 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count5 = 0;
        int count3 = 0;

        for (int i = 0; i < 1; i++) {
            count5 = num / 5;
            if (num % 3 == 0) {
                count3++;
            } else {
                System.out.println(-1);
            }
        }
        if (count5 + count3 != 0) {
            System.out.println(count5 + count3);
        }
    }
}