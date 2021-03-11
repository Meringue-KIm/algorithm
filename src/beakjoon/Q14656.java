package beakjoon;
//2021.03.11

import java.util.Scanner;

public class Q14656 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] arr = new int[num];
        int count = 0;

        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] != i + 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
