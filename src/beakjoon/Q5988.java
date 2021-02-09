package beakjoon;
//2021.02.09 다시풀기
import java.util.Scanner;

public class Q5988 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        while (num != 0) {
            int num1 = scanner.nextInt();
            if (num1 % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
            num--;
        }
    }
}

