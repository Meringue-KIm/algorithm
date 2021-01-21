package gogodan;

import java.util.Scanner;
//2021.01.21
//8입력하면 88단 19입력하면1919단
public class Mission1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[19];

        for (int i = 2; i <= num; i++) {
            for (int j = 0; j < num; j++) {
                arr[j] = i * (j + 1);
                System.out.println(arr[j]);
            }
        }
    }
}

