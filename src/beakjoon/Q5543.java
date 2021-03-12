package beakjoon;
//2021.03.12
import java.util.Arrays;
import java.util.Scanner;

public class Q5543 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] arr1 = new int[6];
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                arr1[sum] = (arr[i] + arr[3 + j]) - 50;
                sum++;
            }
        }
        Arrays.sort(arr1);
        System.out.println(arr1[0]);
    }
}
