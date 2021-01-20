package beakjoon;

import java.util.Scanner;

//2021.01.20
//다시풀기
public class Q2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int d = a * b * c;

        int[] f = new int[10];

        while (d > 0) {
            int e = d % 10;
            d /= 10;
            f[e]++;
        }
        for (int i : f) {
            System.out.println(i);
        }
    }
}
