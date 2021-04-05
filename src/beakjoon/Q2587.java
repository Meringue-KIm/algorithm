package beakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q2587 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int num = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
            num = num + arr[i];
        }
        System.out.println(num / 5);
        Arrays.sort(arr);
        System.out.println(arr[2]);
    }
}
