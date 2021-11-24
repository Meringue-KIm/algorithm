package beakjoon;

import java.util.Scanner;

public class js_5032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int sum = a + b;
        int answer = 0 ;
        while (true) {

            answer += sum / c;
            sum = (sum % c) + (sum / c);
            if (sum < c) {
                break;
            }
        }
        System.out.println(answer);
    }
}
