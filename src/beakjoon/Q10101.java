package beakjoon;

import java.util.Scanner;

public class Q10101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int 합 = A + B + C;

        if (합 != 180) {
            System.out.println("Error");
        } else if (A == 60 && B == 60 && C == 60) {
            System.out.println("Equilateral");
        } else if (A == B || A == C || B == C) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}
