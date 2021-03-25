package beakjoon;
//2021.03.25
import java.util.Scanner;

public class Q9085 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            for (int j = 0; j < num; j++) {
                int sum = scanner.nextInt();
                count = count + sum;
            }
            System.out.println(count);
            count = 0;
        }
    }
}
