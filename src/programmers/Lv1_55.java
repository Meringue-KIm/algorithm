package programmers;

import java.util.Arrays;

// 과일 장수
public class Lv1_55 {

    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int boxNum = score.length / m;
        Arrays.sort(score);

        if (score.length % m == 0) {
            for (int i = 0; i < boxNum; i++) {
                answer += (score[i * m]) * m;
            }
        } else {
            int rest = score.length % m;
            for (int i = 0; i < boxNum; i++) {
                answer += (score[rest + (i * m)]) * m;
            }
        }
        return answer;
    }

}
