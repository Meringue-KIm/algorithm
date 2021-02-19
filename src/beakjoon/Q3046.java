package beakjoon;
//2021.02.19
import java.util.Scanner;

public class Q3046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r1 = scanner.nextInt();
        int r2 = 0;
        int s = scanner.nextInt();

        r2 = s * 2 - r1;

        System.out.println(r2);
    }
}
