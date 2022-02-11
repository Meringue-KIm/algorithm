package beakjoon;

import java.util.Scanner;
//카드 역배치
public class Q10804 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};


        for (int i = 0; i < 10; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            int c = ((Math.abs(a - b) + 1) / 2);
            int count = 0;
            for (int j = 0; j < c; j++) {
                int number = arr[a + count];
                arr[a + count] = arr[b - count];
                arr[b - count] = number;
                count++;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
