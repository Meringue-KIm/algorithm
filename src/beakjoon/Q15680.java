package beakjoon;

import java.util.Scanner;
//2021.02.02
public class Q15680 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (N == 1 || N == 0)
            if (N == 1) {
                System.out.println("Leading the Way to the Future");
            } else {
                System.out.println("YONSEI");
            }
    }
}
