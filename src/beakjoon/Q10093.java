package beakjoon;
//2021.02.03
//런타임 에러 찾는중
import java.util.Scanner;

public class Q10093 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < num2; i++) {
            if (num1 < i) {
                count++;
            }
        }
        System.out.println(count);
        for (int i = 0; i < num2; i++) {
            if (num1 < i) {
                System.out.print(i + " ");
            }
        }
    }
}
