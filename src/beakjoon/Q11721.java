package beakjoon;
//2021.03.04
import java.util.Scanner;

public class Q11721 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        for (int i = 0; i < str.length(); ++i) {
            System.out.print(str.charAt(i));
            if (i % 10 == 9) {
                System.out.println();
            }
        }
    }
}
