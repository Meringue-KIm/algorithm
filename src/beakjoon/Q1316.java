package beakjoon;

import java.util.Scanner;

public class Q1316 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String str = scanner.next();
            boolean[] bolArr = new boolean[26];
            boolean bol = true;
            for (int j = 0; j < str.length(); j++) {
                int index = str.charAt(j) - 'a';
                if (bolArr[index]) {
                    if (str.charAt(j) != str.charAt(j - 1)) {
                        bol = false;
                        break;
                    }
                } else {
                    bolArr[index] = true;
                }
            }
            if (bol) {
                count++;
            }
        }
        System.out.println(count);
    }

}
