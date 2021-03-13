package beakjoon;
//2021.03.13
//while문
import java.util.Scanner;

public class Q4766_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        double sum = 0;

        while (true){
            double num1 = scanner.nextDouble();
            if (num1 == 999) {
                break;
            }
            if (sum == 0) {
                sum = num1 - num;
            } else {
                sum = num1 - sum;
            }
            System.out.printf("%.2f\n", sum);
            sum = num1;
        }
    }
}
