package beakjoon;

import java.util.Scanner;

//2021.01.07
//합
public class Q8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0; // 저장공간
        for (int i = 1; i <= n; i++) {
            sum += i; //sum = sum + i
        }
        System.out.println(sum);
    }
}
