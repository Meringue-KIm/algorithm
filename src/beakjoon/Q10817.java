package beakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q10817 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c = 0;
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}
