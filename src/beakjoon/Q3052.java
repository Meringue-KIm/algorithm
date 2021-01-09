package beakjoon;

import java.util.Scanner;

public class Q3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        int A = 0;
        int B = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt() % 42;
        }

        for (int i = 0; i < 10; i++) {
            A = 0;
            for (int k = i + 1; k < 10; k++) {
                if (arr[i] == arr[k]) {
                    A++;
                }
            }
            if (A == 0) {
                B++;
            }
        }
        System.out.println(B);
    }
}


