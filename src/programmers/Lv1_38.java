package programmers;
//소수찾기 (제곱근)
public class Lv1_38 {

    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            boolean is = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    is = false;
                    break;
                }
            }
            if (is) {
                answer++;
            }
        }
        return answer;
    }

}
