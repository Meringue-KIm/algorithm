package beakjoon;
//2021.02.21
//2022.04.29 다시 풀기

import java.util.Scanner;

public class Q2475 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            count += num * num;
        }
        System.out.println(count % 10);
    }

}
