package beakjoon;
//2021.02.21 다시풀기
//2021.02.22 성공
import java.util.Arrays;
import java.util.Scanner;

public class Q2455 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[4];
        int count = 0;

        for (int i = 0; i < 4; i++) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            count = count + num2;
            arr[i] = Math.abs(count - num1);
            count = count - num1;
        }
        Arrays.sort(arr);
        System.out.println(arr[3]);
    }
}
