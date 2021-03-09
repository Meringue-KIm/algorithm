package beakjoon;
//2021.03.09
import java.util.Scanner;

public class Q2506 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 0;
        int sum = 0;

        for (int i = 0; i < num; i++) {
            if (arr[i] == 1) {
                count++;
                sum += count;
            } else {
                count = 0;
            }
        }
        System.out.println(sum);
    }
}
