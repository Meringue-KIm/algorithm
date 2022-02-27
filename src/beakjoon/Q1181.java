package beakjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
//단어 정렬
public class Q1181 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] str = new String[n];
        scanner.nextLine();

        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.nextLine();
        }

        Arrays.sort(str, new Comparator<String>() {
            public int compare(String s1, String s2) {
                // 단어 길이가 같을 경우
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                // 그 외의 경우
                else {
                    return s1.length() - s2.length();
                }
            }
        });

        System.out.println(str[0]);

        for (int i = 1; i < n; i++) {
            // 중복되지 않는 단어만 출력
            if (!str[i].equals(str[i - 1])) {
                System.out.println(str[i]);
            }
        }
    }

}
