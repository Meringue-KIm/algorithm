package beakjoon;
//2021.08.19
import java.util.Scanner;

public class Q2921 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            for (int j = i; j <= num; j++) {
                sum += i + j;
            }
        }
        System.out.println(sum);
    }
}
