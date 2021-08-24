package beakjoon;
//2021.08.24
import java.util.Scanner;

public class Q2460 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int max = 0;
        for (int i = 0; i < 10; i++) {
            int out = scanner.nextInt();
            int in = scanner.nextInt();
            num -= out;
            num += in;
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}
