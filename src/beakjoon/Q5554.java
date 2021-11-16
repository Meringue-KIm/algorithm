package beakjoon;

import java.util.Scanner;

public class Q5554 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            int num = scanner.nextInt();
            sum += num;
        }

        int 분 = sum / 60;
        int 초 = sum % 60;
        System.out.println(분);
        System.out.println(초);

    }
}
