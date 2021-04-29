package beakjoon;
//2021.04.24
//틀림 동일한 값을 모두 빼버리는 현상
//2711_1 로 다시풀기

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
                arr[j] = str.charAt(j);

                if (arr[j] != c) {
                    System.out.print(arr[j]);
                } else {
                    continue;
                }
            }
            System.out.println();
        }
    }
}
