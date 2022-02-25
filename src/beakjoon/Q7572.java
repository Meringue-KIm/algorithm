package beakjoon;

import java.util.Scanner;
//간지
public class Q7572 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {7, 8, 9, 0, 1, 2, 3, 4, 5, 6};
        String[] strArr = {"J", "K", "L", "A", "B", "C", "D", "E", "F", "G", "H", "I"};

        int num = scanner.nextInt() % 60;

        int a = (num - 1) % arr.length;
        int b = (num - 1) % strArr.length;

        if (num % 60 == 0) {
            System.out.println(strArr[11] + "" + arr[9]);
        } else {
            System.out.println(strArr[b] + "" + arr[a]);
        }
    }

}
