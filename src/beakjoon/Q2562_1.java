package beakjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2562_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        int 최대값 = 0;
        int 위치 = 0;

        for (int i = 0; i < 9; i++) {
            arr.add(scanner.nextInt());
            if (최대값 < arr.get(i)) {
                위치 = i;
                최대값 = arr.get(i);
            }
        }

        System.out.println(최대값);
        System.out.println(위치 + 1);
    }
}
