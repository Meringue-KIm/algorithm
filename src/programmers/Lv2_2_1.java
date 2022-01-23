package programmers;

import java.util.Stack;
//짝지어 제거하기 (스택활용)
public class Lv2_2_1 {

    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
