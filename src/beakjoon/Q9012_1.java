package beakjoon;

import java.util.Scanner;
import java.util.Stack;

public class Q9012_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            String str = scanner.next();
            Stack<Character> stack = new Stack<>();
            for (int j = 0; j < str.length(); j++) {
                if (stack.isEmpty() || stack.peek() == str.charAt(j)) {
                    stack.push(str.charAt(j));
                    if (stack.get(0) == ')') {
                        break;
                    }
                } else {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
