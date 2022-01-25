package programmers;

import java.util.Stack;
//같은 숫자는 싫어
public class Lv1_18 {

    public static Stack<Integer> solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for (int num : arr) {
            if (stack.peek() != num) {
                stack.push(num);
            }
        }
        return stack;
    }
}
