package beakjoon;
//2021.04.13
//못품
import java.util.Scanner;

public class Q12865 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] w = new int[N];
        int[] v = new int[N];

        for (int i = 0; i < N; i++) {
            w[i] = scanner.nextInt();
            v[i] = scanner.nextInt();
        }

        int 정답 = 0;
        int num = 0;
        int 반복횟수 = N - 1;

        for (int i = 0; i < N - 1; i++) {
            for (int j = 1; j < 반복횟수 + 1; j++) {
                if (w[num] + w[j] <= K && v[num] + v[j] >= 정답) {
                    정답 = v[num] + v[j];
                } else {
                    continue;
                }
            }
            num++;
            반복횟수--;
        }
        System.out.println(정답);
    }
}
