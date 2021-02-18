package beakjoon;
//2021.02.18
import java.util.Scanner;

public class Q2914 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a * (b - 1) + 1);
    }
}
