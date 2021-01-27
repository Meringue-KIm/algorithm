package CodeUp;

import java.util.Scanner;

public class easy_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr1 = new int[num];
        int[] arr2 = new int[num];

        for (int i = 0; i < num; i++) {
            arr1[i] = scanner.nextInt();
            arr2[i] = arr1[i];
            System.out.println(arr1[i]);
        }
        for (int i = 0; i <num; i++) {
            System.out.println(arr2[i]);
        }
    }
}

