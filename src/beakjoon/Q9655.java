package beakjoon;
//2021.04.19
import java.util.Scanner;

public class Q9655 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        while (true) {
            if (N % 2 == 0) {
                System.out.println("CY");
                break;
            } else {
                System.out.println("SK");
                break;
            }
        }
    }
}
