package programmers;

import java.util.Arrays;
//프로그래머스 하노이탑 문제 이해를 잘못했음
//재귀를 사용해야..
public class Lv2_6 {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(1)));
    }

    public static int[][] solution(int n) {
        int num = (n + n) - 1;
        int[][] answer = new int[num][2];
        for (int i = 0; i < num; i++) {
            int count = 1;
            for (int j = 0; j < 2; j++) {
                if (i == n - 1) {
                    answer[i][j] = count;
                    count+= 2;
                } else if (i >= n) {
                    answer[i][j] = count + 1;
                    count += 1;
                } else {
                    answer[i][j] = count;
                    count += 1;
                }
            }
        }
        return answer;
    }

}
