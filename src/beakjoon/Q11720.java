package beakjoon;

import java.util.Scanner;

//2021.01.13
//숫자의 합  // sum += a.charAt(i) - '0'; 꼭 이렇게 풀어야만 하는가, 배열을 사용하여 풀어도 가능하지 않은가??
public class Q11720 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        String a = in.next();

        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += a.charAt(i) - '0';
        }
        System.out.print(sum);
    }
}
