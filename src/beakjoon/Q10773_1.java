package beakjoon;

import java.util.Scanner;
import java.util.Stack;

public class Q10773_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int num = scanner.nextInt();
            if (num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }
        int sum = 0;
        for (int i : stack) {
            sum += i;
        }
        System.out.println(sum);
    }

}
