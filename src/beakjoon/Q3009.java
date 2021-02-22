package beakjoon;
//2021.02.22
import java.util.Scanner;

public class Q3009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num1 = {scanner.nextInt(), scanner.nextInt()};
        int[] num2 = {scanner.nextInt(), scanner.nextInt()};
        int[] num3 = {scanner.nextInt(), scanner.nextInt()};

        int x;
        int y;

        if (num1[0] == num2[0]) {
            x = num3[0];
        } else if (num1[0] == num3[0]) {
            x = num2[0];
        } else {
            x = num1[0];
        }

        if (num1[1] == num2[1]) {
            y = num3[1];
        } else if (num1[1] == num3[1]) {
            y = num2[1];
        } else {
            y = num1[1];
        }
        System.out.println(x + " " + y);
    }
}
