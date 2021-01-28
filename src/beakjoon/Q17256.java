package beakjoon;

import java.util.Scanner;

//2021.01.28
public class Q17256 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 = new int[3];
        int[] arr2 = new int[3];

        for (int i = 0; i < 3; i++) {
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            arr2[i] = scanner.nextInt();
        }

        int bx = arr2[0] - arr1[2];
        int bz = arr2[1] / arr1[1];
        int by = arr2[2] - arr1[0];

        System.out.println(bx + " " + bz + " " + by);
    }
}
