package beakjoon;

import java.util.Scanner;
//2021.01.11
//성준이 문제풀이 구구단 2단부터 9단
public class Qsoso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}


