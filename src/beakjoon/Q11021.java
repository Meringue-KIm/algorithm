package beakjoon;

import java.util.Scanner;

//2021.01.07
//A+B - 7
public class Q11021 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            String x = "Case #" + i + ": " + a + " + " + b + " = " + (a + b);
            stringBuilder.append(x + "\n");
        }
        System.out.println(stringBuilder.toString());
    }
}
