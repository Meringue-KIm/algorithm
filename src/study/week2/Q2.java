package study.week2;

import java.util.Stack;

// 같은 숫자는 싫어
public class Q2 {

    public Stack<Integer> solution(int []arr) {
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
