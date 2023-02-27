package study.week1;

import java.util.Scanner;

// 최대공약수와 최소공배수
public class Q4 {

    public static void main(String[] args) { // 유클리드 호제법 // 검색해서 풀었음
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int min = Math.min(a, b);
        int gcd = 0;
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        System.out.println(gcd);
        System.out.println(a * b / gcd);
    }

}
