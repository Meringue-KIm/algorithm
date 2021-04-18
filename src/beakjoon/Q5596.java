package beakjoon;
//2021.04.18
import java.util.Scanner;

public class Q5596 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = 0;
        int t = 0;

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 4; j++) {
                int num = scanner.nextInt();
                s = s + num;
            }
            for (int j = 0; j < 4; j++) {
                int num = scanner.nextInt();
                t = t + num;
            }
        }
        if (s > t) {
            System.out.println(s);
        } else {
            System.out.println(t);
        }
    }
}
