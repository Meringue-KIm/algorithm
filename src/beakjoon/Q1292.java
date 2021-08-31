package beakjoon;
//2021.08.30
import java.util.Scanner;

public class Q1292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int[] arr = new int[1002];
        int count = 1;

        for (int i = 1; i <= 1000; i++) {
            for (int j = 0; j < i; j++) {
                if (count == 1001) {
                    break;
                } else {
                    arr[count] = i;
                    count++;
                }
            }
        }
        int sum = 0;

        for (int i = A; i <= B; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
