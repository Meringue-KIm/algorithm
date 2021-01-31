package beakjoon;
//2021.01.31
import java.util.Scanner;

public class Q17388 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int S = scanner.nextInt();
        int K = scanner.nextInt();
        int H = scanner.nextInt();

        int num = S + K + H;

        if (num >= 100) {
            System.out.println("OK");
        }
        if (num < 100) {
            if (S < K && S < H) {
                System.out.println("Soongsil");
            } else if (K < S && K < H) {
                System.out.println("Korea");
            } else if (H < S && H < K) {
                System.out.println("Hanyang");
            }
        }
    }
}
