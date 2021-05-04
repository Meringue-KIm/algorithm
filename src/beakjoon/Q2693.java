package beakjoon;
//2021.05.03
//2021.05.04
import java.util.Arrays;
import java.util.Scanner;

public class Q2693 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int[] arr = new int[10];

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 10; j++) {
                arr[j] = scanner.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[7]);
        }
    }
}
