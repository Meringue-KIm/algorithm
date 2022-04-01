package beakjoon;

import java.util.Scanner;

public class Q11944 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            sb.append(n);
        }
        if (sb.length() > m) {
            System.out.println(sb.substring(0, m));
        } else {
            System.out.println(sb);
        }
    }
}
