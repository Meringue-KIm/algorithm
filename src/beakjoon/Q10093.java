package beakjoon;
//2021.02.03
//런타임 에러 찾는중
//에러 찾음
import java.util.Scanner;

public class Q10093 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();

        if (num1 == num2) {
            System.out.println(0);
        } else {
            System.out.println(Math.abs(num1 - num2) - 1);
        }

        long start = 0;
        long end = 0;

        if (num1 > num2) {
            start = num2;
            end = num1;
        } else {
            start = num1;
            end = num2;
        }
        for (long i = start + 1; i < end; i++) {
            System.out.print(i + " ");
        }
    }
}

