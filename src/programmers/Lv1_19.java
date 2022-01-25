package programmers;
//나머지가 1이 되는 수 찾기
public class Lv1_19 {

    public int solution(int n) {
        int answer = 2;
        while (n % answer != 1) {
            answer++;
        }
        return answer;
    }

}
