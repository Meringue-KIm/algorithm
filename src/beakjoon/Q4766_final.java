package beakjoon;
//2021.03.14
//4766 정답
import java.util.Scanner;

public class Q4766_final {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();

        while (true) {
            double numnum = scanner.nextDouble();

            if (numnum == 999) {
                break;
            }
            double sum = numnum - num;
            System.out.printf("%.2f\n", sum);
            num = numnum;
        }
    }
}
