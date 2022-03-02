package beakjoon;

import java.util.Scanner;

public class Q10214 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int yt = 0;
            int kt = 0;
            for (int j = 0; j < 9; j++) {
                yt += scanner.nextInt();
                kt += scanner.nextInt();
                if (yt > kt) {
                    yt++;
                } else if (yt < kt) {
                    kt++;
                }
            }
            if (yt > kt) {
                System.out.println("Yonsei");
            } else if (kt > yt) {
                System.out.println("Korea");
            } else {
                System.out.println("Draw");
            }
        }
    }
}
