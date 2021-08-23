package beakjoon;
//2021.08.22
//stack 시간초과
//2021.08.23
//StringBuilder사용해서 시간초과 해결
import java.util.Scanner;
import java.util.Stack;

public class Q10828_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            String input = scanner.next();
            if (input.contains("push")) {
                int input2 = scanner.nextInt();
                stack.push(input2);
            } else if (input.equals("pop")) {
                sb.append(stack.isEmpty() ? -1 : stack.pop());
                sb.append("\n");
            } else if (input.equals("size")) {
                sb.append(stack.size());
                sb.append("\n");
            } else if (input.equals("empty")) {
                sb.append(stack.isEmpty() ? 1 : 0);
                sb.append("\n");
            } else if (input.equals("top")) {
                sb.append(stack.isEmpty() ? -1 : stack.peek());
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
