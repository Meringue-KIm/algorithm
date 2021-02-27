package beakjoon;
//2021.02.27
import java.util.Scanner;

public class Q2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int sum = 0;
        int 최댓값 = 0;

        if (a == b && a == c) {
            sum = 10000 + a * 1000;
        } else if (a == b) {
            sum = 1000 + a * 100;
        } else if (a == c) {
            sum = 1000 + a * 100;
        } else if (b == c) {
            sum = 1000 + b * 100;
        } else {
            if (a >= b && a >= b) {
                최댓값 = a;
            } else if (b >= a && b >= c) {
                최댓값 = b;
            } else {
                최댓값 = c;
            }
            sum = 최댓값 * 100;
        }
        System.out.println(sum);
    }
}
