package beakjoon;

import java.util.Scanner;

public class Q2902 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        for (int i = 0; i <str.length(); i++) {
            char c = str.charAt(i);
            if (c < 95) {
                if (c >= 65) {
                    System.out.print(c);
                }
            }
        }
    }
}
