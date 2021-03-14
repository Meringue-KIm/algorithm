package beakjoon;
//2021.03.14
import java.util.Scanner;

public class Q10833 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            int num1 = scanner.nextInt();

            sum = sum + (num1 % num);
        }
        System.out.println(sum);
    }
}
