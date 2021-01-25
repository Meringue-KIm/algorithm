package CodeUp;

import java.util.Scanner;

public class easy_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int 시 = scanner.nextInt();
        int 분 = scanner.nextInt();

        if (시 != 0) {
            if (분 - 30 < 0) {
                시--;
                분 = 분 + 30;
                System.out.printf(시 + " " + 분);

            } else {
                분 = 분 - 30;
                System.out.println(시 + " " + 분);
            }
        } else if (시 == 0) {
            if (분 - 30 >= 0) {
                분 = 분 - 30;
                System.out.println(시 + " " + 분);
            } else {
                시 = 23;
                분 = 분 + 30;
                System.out.println(시 + " " + 분);
            }
        }
    }
}


