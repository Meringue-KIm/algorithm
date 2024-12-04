package programmers;

import java.util.LinkedList;
import java.util.Queue;

// 카드 뭉치
public class Lv1_56 {

    public static void main(String[] args) {
        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
        String[] result = {"i", "want", "to", "drink", "water"};
        System.out.println(solution(cards1, cards2, result));
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> queueCards1 = new LinkedList<>();
        Queue<String> queueCards2 = new LinkedList<>();

        for (String s : cards1) {
            queueCards1.offer(s);
        }

        for (String s : cards2) {
            queueCards2.offer(s);
        }

        boolean go = false;
        int count = 0;
        for (String s : goal) {
            if (go) {
                break;
            }
            if (queueCards1.peek() != null) {
                if (queueCards1.peek().equals(s)) {
                    queueCards1.remove();
                    count++;
                    continue;
                }
            }

            if (queueCards2.peek() != null) {
                if (queueCards2.peek().equals(s)) {
                    queueCards2.remove();
                    count++;
                    continue;
                }
            }
            go = true;
        }

        if (count == goal.length) {
            return "Yes";
        } else {
            return "No";
        }
    }


}
