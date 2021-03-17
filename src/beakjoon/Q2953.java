package beakjoon;
//2021.03.17
import java.util.Scanner;

public class Q2953 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[4];
        int max = 0;
        int max1 = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j] = scanner.nextInt();
                max = max + arr[j];
            }
            if (max1 > max) {
        }
    }
}
