package programmers;

import java.util.Stack;
//올바른 괄호
public class Lv2_13 {

    static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i == 0 && c == ')') {
                return false;
            }
            if (!stack.isEmpty() && c == ')') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

}
