package beakjoon;

import java.util.Scanner;
//2021.02.12
public class Q5565 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int count = num;

        if (num <= 10000) {
            for (int i = 0; i < 9; i++) {
                int num1 = scanner.nextInt();
                count = count - num1;
            }
        }
        System.out.println(count);
    }
}