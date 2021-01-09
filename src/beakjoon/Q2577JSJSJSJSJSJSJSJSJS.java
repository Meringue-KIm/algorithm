package beakjoon;

import java.util.Scanner;

public class Q2577JSJSJSJSJSJSJSJSJS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = a * b * c;

        int[] f = new int[10];

        while (d > 0) {
            int z = d % 10;
            d /= 10;
            f[z]++;
        }
        for (int i : f) {
            System.out.println(i);
        }
    }
}
