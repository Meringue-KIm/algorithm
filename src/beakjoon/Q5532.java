package beakjoon;

import java.util.Scanner;

public class Q5532 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int 방학기간 = scanner.nextInt();
        int 국어 = scanner.nextInt();
        int 수학 = scanner.nextInt();
        int 국어공부 = scanner.nextInt();
        int 수학공부 = scanner.nextInt();

        if (국어 % 국어공부 == 0) {
            국어 = 국어 / 국어공부;
        } else {
            국어 = (국어 / 국어공부) + 1;
        }

        if (수학 % 수학공부 == 0) {
            수학 = 수학 / 수학공부;
        } else {
            수학 = (수학 / 수학공부) + 1;
        }

        if (수학 > 국어) {
            System.out.println(방학기간 - 수학);
        } else {
            System.out.println(방학기간 - 국어);
        }
    }
}
