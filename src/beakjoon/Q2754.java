package beakjoon;
//2021.04.26
//2021.04.27 준성이가 도와줌

import java.util.Scanner;

public class Q2754 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] 성적배열 = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D+", "D0", "D-", "F"};
        String[] 점수배열 = {"4.3", "4.0", "3.7", "3.3", "3.0", "2.7", "2.3", "2.0", "1.7", "1.3", "1.0", "0.7", "0.0"};

        String 성적 = scanner.nextLine();

        for (int i = 0; i < 성적배열.length; i++) {
            if (성적.equals(성적배열[i])) {
                System.out.println(점수배열[i]);
                break;
            }
        }
    }
}
