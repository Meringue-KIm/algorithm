package beakjoon;

import java.util.Scanner;

//2021.01.28
public class Q10953 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        while (num-- > 0) {
            String[] str = scanner.next().split(",");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            System.out.println(a+b);
        }
    }
}
