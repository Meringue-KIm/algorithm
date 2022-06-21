package beakjoon;

import java.util.Scanner;

public class Q3028 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int A = 1;
        int B = 0;
        int C = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'C') {
                int num = C;
                C = A;
                A = num;
            } else if (ch == 'B') {
                int num = B;
                B = C;
                C = num;
            } else {
                int num = A;
                A = B;
                B = num;
            }
        }
        if (A == 1) {
            System.out.println(1);
        } else if (B == 1) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }

}
