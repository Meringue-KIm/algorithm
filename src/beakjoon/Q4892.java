package beakjoon;
//2021.01.30
import java.util.Scanner;

public class Q4892 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;

        int count = 1;

        while (true) {
            num = scanner.nextInt();
            num1 = num * 3;
            if (num1 % 2 == 0) {
                num2 = num1 / 2;
            } else {
                num2 = (num1 + 1) / 2;
            }
            num3 = 3 * num2;
            num4 = num3 / 9;
            if (num == 0) {
                break;
            }
            if (num1 % 2 == 0) {
                num = num4 * 2;
                System.out.println(count + ". " + "even " + num4);
                count++;
                continue;
            } else {
                num = 2 * num4;
                System.out.println(count + ". " + "odd " + num4);
                count++;
                continue;
            }
        }
    }
}
