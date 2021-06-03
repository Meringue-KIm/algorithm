package beakjoon;

import java.util.Scanner;

public class JS_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            int[] arr = new int[count];
            arr[count - 1] = num;
            count++;
            for (int i = 0; i <= count; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
