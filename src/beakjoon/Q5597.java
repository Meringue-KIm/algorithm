package beakjoon;

import java.util.Scanner;

public class Q5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] arr = new boolean[30];

        for (int i = 0; i < 28; i++) {
            int input = sc.nextInt();
            arr[input - 1] = true;
        }
        for (int j = 0; j < 30; j++) {
            if (!arr[j]) {
                System.out.println(j + 1);
            }
        }
    }
}
