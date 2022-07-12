package beakjoon;

import java.util.Scanner;
//시간초과
public class Q1929 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                continue;
            }
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    if (j == i) {
                        sb.append(i).append("\n");
                    }
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
