package beakjoon;

import java.util.Scanner;
//틀림 dp..
public class Q1463 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int number = num;
        int 자리수 = 0;
        while (number > 1) {
            number /= 10;
            자리수++;
        }
        int 진짜자리수 = 1;

        for (int i = 0; i < 자리수 - 1; i++) {
            진짜자리수 *= 10;
        }

        int count = 0;
        while (num != 1 && num > 0) {
            if (num % 10 == 0) {
                num -= 진짜자리수;
                count++;
                진짜자리수 = num % 10;
                continue;
            }
            if (num % 3 == 0 ) {
                num /= 3;
                count++;
                continue;
            }
            if (num % 2 == 0) {
                num /= 2;
                count++;
                continue;
            }
            num--;
            count++;
        }
        System.out.println(count);
    }

}
