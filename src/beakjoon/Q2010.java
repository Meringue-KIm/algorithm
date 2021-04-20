package beakjoon;
//2021.04.20
import java.util.Scanner;

public class Q2010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        int cnt = scanner.nextInt();
        for (int i = 0; i < cnt; i++) {
            int num = scanner.nextInt();
            sum += num;
        }
        System.out.println(sum - (cnt - 1));
    }
}
