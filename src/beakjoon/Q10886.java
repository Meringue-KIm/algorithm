package beakjoon;

import java.util.Scanner;

public class Q10886 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int 귀엽다 = 0;
        int 귀엽지않다 = 0;

        for (int i = 0; i < num; i++) {
            int N = scanner.nextInt();
            if (N == 0) {
                귀엽지않다++;
            } else {
                귀엽다++;
            }
        }
        if (귀엽다 > 귀엽지않다) {
            System.out.println("Junhee is cute!");
        } else {
            System.out.println("Junhee is not cute!");
        }
    }
}
