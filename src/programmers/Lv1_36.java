package programmers;

public class Lv1_36 {

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < signs.length; i++) {
            if (!signs[i]) {
                answer -= absolutes[i];
                continue;
            }
            answer += absolutes[i];
        }
        return answer;
    }

}
