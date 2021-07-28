package beakjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10868_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();

        int num = scanner.nextInt();
        int 범위갯수 = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            arr.add(scanner.nextInt());
        }

        int 최솟값 = 1000000000;

        for (int i = 0; i < 범위갯수; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            for (int j = A - 1; j <= B - 1; j++) {
                if (최솟값 > arr.get(j)) {
                    최솟값 = arr.get(j);
                }
            }
            System.out.println(최솟값);
            최솟값 = 1000000000;
        }
    }
}

