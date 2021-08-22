package beakjoon;
//2021.08.22
//stack 시간초과
import java.util.Scanner;
import java.util.Stack;

public class Q10828_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            String input = scanner.next();
            if (input.contains("push")) {
                int input2 = scanner.nextInt();
                stack.push(input2);
            } else if (input.equals("pop")) {
                System.out.println(stack.isEmpty() ? -1 : stack.pop());
            } else if (input.equals("size")) {
                System.out.println(stack.size());
            } else if (input.equals("empty")) {
                System.out.println(stack.isEmpty() ? 1 : 0);
            } else if (input.equals("top")) {
                System.out.println(stack.isEmpty() ? -1 : stack.peek());
            }
        }
    }
}
