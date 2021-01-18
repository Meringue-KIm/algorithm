package beakjoon;

import java.util.Scanner;

public class Q9498_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a > 100) {
            System.out.println("입력 값을 초과하였습니다.");
        }
        if (!(a > 100)) {
            if (a >= 90) {
                System.out.println("A");
            } else if (a >= 80) {
                System.out.println("B");
            } else if (a >= 70) {
                System.out.println("C");
            } else if (a >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }
    }
}
