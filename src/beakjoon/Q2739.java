package beakjoon;

import java.util.Scanner;
//2021.01.07
//구구단
public class Q2739 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 1; i <= 9; ++i) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}

