package beakjoon;

import java.util.Scanner;
import java.util.Stack;

public class Q4949 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();
            if (str.equals(".")) {
                break;
            }
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == ')' || str.charAt(i) == ']') {
                    if (stack.isEmpty() || str.charAt(i) == '(' || str.charAt(i) == '[') {
                        stack.push(str.charAt(i));
                    } else {
                        if (stack.peek() == '(' && str.charAt(i) == ')') {
                            stack.pop();
                        } else if (stack.peek() == '[' && str.charAt(i) == ']') {
                            stack.pop();
                        } else {
                            break;
                        }
                    }
                }
            }
            if (stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

}
