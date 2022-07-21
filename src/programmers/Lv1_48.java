package programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
//크레인 인형뽑기 게임

public class Lv1_48 {

    public int solution(int[][] board, int[] moves) {
        List<Stack<Integer>> list = new ArrayList<>();
        Stack<Integer> results = new Stack<>();
        for (int i = 0; i < board.length; i++) {
            Stack<Integer> stack = new Stack<>();
            for (int j = board.length; j > 0; j--) {
                if (board[j - 1][i] != 0) {
                    stack.push(board[j - 1][i]);
                }
            }
            list.add(stack);
        }
        int count = 0;
        for (int move : moves) {
            if (list.get(move - 1).empty()) {
                continue;
            }
            if (results.isEmpty()) {
                results.push(list.get(move - 1).peek());
                list.get(move - 1).pop();
            } else {
                if (results.peek().equals(list.get(move - 1).peek())) {
                    results.pop();
                    list.get(move - 1).pop();
                    count += 2;
                } else {
                    results.push(list.get(move - 1).peek());
                    list.get(move - 1).pop();
                }
            }
        }
        return count;
    }

}
