package beakjoon;

import java.util.Scanner;

public class Q2869 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int V = scanner.nextInt();
        int count = 1;
        int max = 0;
        while (max <= V) {
            max += ((A * count) - (B * count));
            count++;
        }

        System.out.println(count - 1);
    }

}
