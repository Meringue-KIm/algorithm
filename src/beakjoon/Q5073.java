package beakjoon;
//2021.03.07
//다시풀기...
import java.util.Scanner;

public class Q5073 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int max = 0;

            if (a >= b && a >= c) {
                max = a;
            } else if (b >= a && b >= c) {
                max = b;
            } else {
                max = c;
            }

            if (a == 0 && b == 0 && c ==0) {
                break;
            }
            int num = max - (a + b + c);

            if (a == b && b == c) {
                System.out.println("Equilateral");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
            } else if (max >= Math.abs(num)) {
                System.out.println("Invalid");
            } else {
                System.out.println("Scalene ");
            }
        }
    }
}
