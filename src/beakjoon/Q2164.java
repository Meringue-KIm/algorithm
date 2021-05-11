package beakjoon;
//2021.05.07
//틀림
import java.util.Scanner;

public class Q2164 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];

        for (int i = 1; i <= N; i++) {
            arr[i - 1] = i;
        }

        int count = 0;
        int 저장소 = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = 0;
            저장소 = arr[i + 1];
            for (int j = 1 + count; j < N; j++) {
                arr[j] = arr[j + 1];
            }
            count++;
            arr[N] = 저장소;
        }
        System.out.println(저장소);
    }
}
