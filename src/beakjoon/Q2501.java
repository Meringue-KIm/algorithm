package beakjoon;
//2021.08.18

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2501 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();

        int num = scanner.nextInt();
        int num1 = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                arr.add(i);
                count++;
            }
        }
        if (count < num1) {
            System.out.println(0);
        } else {
            System.out.println(arr.get(num1 - 1));
        }
    }
}
