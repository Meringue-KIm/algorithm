package beakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q2750 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for (int j : arr) {
            System.out.println(j);
        }
    }

}
