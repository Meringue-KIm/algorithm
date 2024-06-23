package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 명예의 전당(1)
public class Lv1_53 {

    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> rank = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            rank.add(score[i]);

            if (rank.size() > k) {
                rank.remove(Collections.min(rank));
            }

            answer[i] = Collections.min(rank);
        }
        return answer;
    }

}
