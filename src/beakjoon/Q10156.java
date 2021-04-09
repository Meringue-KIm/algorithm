package beakjoon;
//2021.04.09
import java.util.Scanner;

public class Q10156 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int num = 0;

        num = k * n;

        if (num < m) {
            System.out.println(0);
        } else {
            num = Math.abs(num - m);
            System.out.println(num);
        }
    }
}
