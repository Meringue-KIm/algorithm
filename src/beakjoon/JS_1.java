package beakjoon;
//2021.06.03
//얕은 복사
//ArrayList - 배열 더하기 만들기

import java.util.Scanner;

public class JS_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int[] 기억배열 = new int[1];

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            count++;
            int[] arr = new int[count];
            for (int i = 0; i < 기억배열.length; i++) {
                arr[i] = 기억배열[i];
            }
            arr[count - 1] = num;

            for (int i : arr) {
                System.out.println(i);
            }
            기억배열 = arr;
        }
    }
}