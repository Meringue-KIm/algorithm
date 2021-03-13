package beakjoon;
//2021.03.13
//for문
import java.util.Scanner;

public class Q4766 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        double sum = 0;

        for (int i = 0; i < 4; i++) {
            double num1 = scanner.nextDouble();
            if (num1 == 999) {
                break;
            }
            if (i == 0) {
                sum = num1 - num;
            } else {
                sum = num1 - sum;
            }
            System.out.printf("%.2f\n", sum);
            sum = num1;
        }
    }
}
