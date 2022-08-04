package programmers;

//x만큼 간격이 있는 n개의 숫자
public class Lv1_1 {

    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        for (int i = 1; i <= answer.length; i++) {
            long num = x * i;
            answer[i - 1] = num;
        }
        return answer;
    }

}
