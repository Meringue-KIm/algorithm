package beakjoon;
//2021.02.05
//굿굿
import java.util.Scanner;

public class Q1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 64;
        int x = sc.nextInt();
        int count = 0;

        while (x > 0) {
            if (num > x) {
                num /= 2;
            } else {
                count++;
                x -= num;
            }
        }
        System.out.println(count);
    }
}

