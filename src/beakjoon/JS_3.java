package beakjoon;
//2021.06.08
//ArrayList - 배열 빼기 만들기 (원하는 인덱스 입력시 삭제)

import java.util.Scanner;

public class JS_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int count = 10;
        while (scanner.hasNext()) {
            int 인덱스 = scanner.nextInt();
            count--;
            int[] arr2 = new int[count];
            int num = 0;

            for (int i = 0; i < arr.length; i++) {
                if (i == 인덱스) {
                    continue;
                } else {
                    arr2[num] = arr[i];
                    num++;
                }
            }
            for (int i : arr2) {
                System.out.println(i);
            }
            arr = arr2;
        }
    }
}
