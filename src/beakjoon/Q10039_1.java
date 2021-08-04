package beakjoon;

import java.util.Scanner;

public class Q10039_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        int 합 = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] < 40) {
                arr[i] = 40;
            }
            합 += arr[i];
        }
        System.out.println(합 / 5);
    }
}
