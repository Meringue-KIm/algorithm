package beakjoon;

import java.util.Scanner;

public class Q1100_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[8];
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            int 색;
            if (i % 2 == 0) {
                색 = 0;
            } else {
                색 = 1;
            }
            arr[i] = scanner.next();
            for (int j = 0; j < 8; j++) {
                char[] ch = arr[i].toCharArray();
                if (색 == 0) {
                    if (j % 2 == 0) {
                        if (ch[j] == 70) {
                            cnt++;
                        }
                    }
                }
                if (색 == 1) {
                    if (j % 2 == 1) {
                        if (ch[j] == 70) {
                            cnt++;
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }

}
