package CodeUp;

import java.util.Scanner;

public class easy_000000 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a >= b && a >= c) {
            if (b >= c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        } else if (b >= a && b >= c) {
            if (a >= c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (a >= b) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        }
    }
}