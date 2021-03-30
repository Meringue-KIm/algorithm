package beakjoon;
//2021.03.29.
//for문이 동작하고 다시 돌기전에 출력
import java.util.Scanner;

public class Q13015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (num * 2) - 3; j++) {
                if (i == 0) {
                    System.out.print(" ");
                }
            }
        }


        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < ; j++) {
                
            }
        }

    }
}
