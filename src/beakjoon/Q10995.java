package beakjoon;
//2021.02.27
import java.util.Scanner;

public class Q10995 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int star = scanner.nextInt();

        for (int i = 0; i < star; i++) {
            for (int j = 0; j < 2 * star; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

