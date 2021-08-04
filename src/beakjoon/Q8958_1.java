package beakjoon;

import java.util.Scanner;

public class Q8958_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            String str = scanner.next();
            char[] arr = new char[str.length()];
            int 점수 = 1;
            int 정답 = 0;

            for (int j = 0; j < str.length(); j++) {
                arr[j] = str.charAt(j);
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == 'X') {
                    점수 = 1;
                    continue;
                }
                정답 += 점수++;
            }
            System.out.println(정답);
        }
    }
}
