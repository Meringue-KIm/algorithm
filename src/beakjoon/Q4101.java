package beakjoon;
//21.01.30

import java.util.Scanner;

public class Q4101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        do {
            String a = " ";
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            if (num1 == 0 && num2 == 0) {
                break;
            } else
                a = (num1 > num2) ? "Yes" : "No";
            System.out.println(a);
        } while (true);
    }
}