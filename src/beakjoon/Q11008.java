package beakjoon;

import java.util.Scanner;

public class Q11008 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            String str = scanner.next();
            String strValue = str.replace(scanner.next(), "1");
            System.out.println(strValue.length());
        }
    }

}
