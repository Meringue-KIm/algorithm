package CodeUp;

import java.util.Scanner;

public class easy_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if (score < 101) {
            if (score >= 90) {
                System.out.println("A");
            } else if (score >= 70) {
                System.out.println("B");
            } else if (score >= 40) {
                System.out.println("C");
            } else if (score >= 0) {
                System.out.println("D");
            }
        } else {
            System.out.println("입력을 잘못하셨습니다.");
        }
    }
}
