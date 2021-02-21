package beakjoon;
//2021.02.21
import java.util.Scanner;

public class Q2490 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                int num = scanner.nextInt();
                count = count + num;
            }
            if (count == 0) {
                System.out.println("D");
            } else if (count == 1) {
                System.out.println("C");
            } else if (count == 2) {
                System.out.println("B");
            } else if (count == 3) {
                System.out.println("A");
            } else {
                System.out.println("E");
            }
            count = 0;
        }
    }
}

