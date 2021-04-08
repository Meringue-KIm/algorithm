package beakjoon;
//2021.04.08
//다시 풀어볼 문제
import java.util.Scanner;

public class Q2702 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int multiple = 0;
        int trivial = 0;
        int i = 1;

        for (int j = 0; j < N; j++) {
            int one = scanner.nextInt();
            int two = scanner.nextInt();
            while (i <= one && i <= two) {
                if (one % i == 0 && two % i == 0) {
                    trivial = i;
                }
                i++;
            }
            multiple = (one * two) / trivial;

            System.out.println(multiple + " " + trivial);
            multiple = 0;
            trivial = 0;
            i = 1;
        }
    }
}

