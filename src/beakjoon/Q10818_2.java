package beakjoon;

import java.util.Scanner;

public class Q10818_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int number = scanner.nextInt();
        int max = number;
        int min = number;
        for (int i = 0; i < n - 1; i++) {
            int num = scanner.nextInt();
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }
        System.out.println(min + " " + max);
    }
}
