package beakjoon;
//2021.08.25
//중복되는 Stringbuiler.append를 제거
import java.util.Scanner;
import java.util.Stack;

public class Q10828_2 {

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
                append(sb, stack.isEmpty() ? -1 : stack.pop());
            } else if (input.equals("size")) {
                append(sb, stack.size());
            } else if (input.equals("empty")) {
                append(sb, stack.isEmpty() ? 1 : 0);
            } else if (input.equals("top")) {
                append(sb, stack.isEmpty() ? -1 : stack.peek());
            }
        }
        System.out.println(sb);
    }

    private static void append(StringBuilder sb, int result) {
        sb.append(result);
        sb.append(System.lineSeparator());
    }
}