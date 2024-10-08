package beakjoon;

import java.util.Scanner;
// 최댓값
public class Q2566 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < 9; i++) {
            String[] a = scanner.nextLine().split(" ");
            for (int j = 0; j < 9; j++) {
                int num = Integer.parseInt(a[j]);
                if (max <= num) {
                    max = num;
                    x = i + 1;
                    y = j + 1;
                }
            }

        }
        System.out.println(max);
        System.out.println(x + " " + y);
    }

}
