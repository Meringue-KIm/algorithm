package beakjoon;

import java.util.Scanner;

public class Q8393_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;

        for (int i = n; i >= 1; i--) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
