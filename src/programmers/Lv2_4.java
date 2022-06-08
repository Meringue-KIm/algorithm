package programmers;

import java.util.Stack;

public class Lv2_4 {

    public static void main(String[] args) {

    }

    public static int solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            StringBuilder sb = new StringBuilder();
            Stack<Character> stack = new Stack<>();
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(i);
                if (stack.isEmpty()) {
                    stack.push(ch);
                } else if (stack.peek() == ch){
                    stack.push(ch);
                } else {

                }
            }
        }

        return answer;
    }

}
