package beakjoon;
//2021.02.14
//별 찍기 -9
import java.util.Scanner;

public class Q2446 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int count = 2 * num - 1;
        int 공백 = 0;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print("*");
            }
            count = count - 2;
            System.out.println();
            공백++;
            if (i != num - 1) {
                for (int j = 0; j < 공백; j++) {
                    System.out.print(" ");
                }
            }
        }
        count = 1;
        공백 = num - 1;
        for (int i = 0; i < num - 1; i++) {
            공백--;
            count = count + 2;
            for (int j = 0; j < 공백; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < count; j++) {
                System.out.print("*");
            }
            if (i != num - 2) {
                System.out.println();
            }
        }
    }
}
