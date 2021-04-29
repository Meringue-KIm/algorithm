package beakjoon;
//2021.04.28

import java.util.Scanner;

public class Q2711_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int num = scanner.nextInt();
            String str = scanner.next();

            for (int j = 0; j < str.length(); j++) {
                char[] ch = new char[str.length()];
                ch[j] = str.charAt(j);

                if (j == num - 1) {
                    continue;
                } else {
                    System.out.print(ch[j]);
                }
            }
            System.out.println();
        }
    }
}
