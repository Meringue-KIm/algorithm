package beakjoon;

import java.util.Scanner;

//2021.01.28
public class Q16394 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a = 1946;
        int count = 0;

        for (int i = a; i < num; i++) {
            if (a < num) {
                count++;
            }
        }
        System.out.println(count);
    }
}
