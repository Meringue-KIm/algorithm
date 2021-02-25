package beakjoon;
//2021.02.25
import java.util.Scanner;

public class Q2576 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 100;
        int[] arr = new int[7];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] % 2 == 1) {
                sum = sum + arr[i];
                if (count > arr[i]) {
                    count = arr[i];
                }
            }
        }
        if (sum == 0) {
            System.out.println("-1");
        } else {
            System.out.println(sum);
            System.out.println(count);
        }
    }
}
