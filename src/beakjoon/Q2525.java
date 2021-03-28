package beakjoon;
//2021.03.28
//시간관련 문제
import java.util.Scanner;

public class Q2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt(); // 시
        int B = scanner.nextInt(); // 분
        int sum = scanner.nextInt(); // 소요시간
        int 분합계 = B + sum;

        while (true) {
            if (분합계 > 59) {
                분합계 = 분합계 - 60;
                A++;
            }
            if (A == 24) {
                A = 0;
            } else if (A > 24) {
                A = A - 24;
            }
            if (A < 24 && 분합계 < 60) {
                break;
            }
        }
        System.out.println(A + " " + 분합계);
    }
}
