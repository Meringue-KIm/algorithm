package CodeUp;

import java.util.Scanner;

public class easy_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        int goal = scanner.nextInt();

        int count = 0;

        for (int i = 0; i < 90 - time; i = i + 5) {
            count++;
        }
        System.out.println(count + goal);
    }
}
