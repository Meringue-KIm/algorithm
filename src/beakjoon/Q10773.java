package beakjoon;
//2021.02.20
import java.util.Scanner;

public class Q10773 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = -1;
        int k = scanner.nextInt();
        int[] arr = new int[k];

        for (int i = 0; i < k; i++) {
            int num = scanner.nextInt();

            if (num == 0) {
                count--;
            } else {
                count++;
                arr[count] = num;
            }
        }
        int sum = 0;

        for (int i = 0; i <= count; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
