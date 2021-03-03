package beakjoon;
//2021.03.03
import java.util.Scanner;

public class Q14909 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (0 < num) {
                count++;
            }
        }
        System.out.println(count);
    }
}
