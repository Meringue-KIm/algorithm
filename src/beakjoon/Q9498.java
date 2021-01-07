package beakjoon;

import java.util.Scanner;

// 2021.01.04
// 시험 성적
public class Q9498 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        if (a >= 90) {
            System.out.println("A");
        } else if (a >= 80) {
            System.out.println("B");
        } else if (a >=70) {
            System.out.println("C");
        } else if (a >=60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
