package beakjoon;
//2021.04.24

import java.util.Scanner;

public class Q2711 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int num = scanner.nextInt();
            String str = scanner.nextLine();

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(num);

                char[] arr = new char[str.length()];
                arr[i] = str.charAt(i);

                if (arr[i] != c) {
                    System.out.print(arr[i]);
                } else {
                    continue;
                }
            }
            System.out.println();
        }
    }
}
