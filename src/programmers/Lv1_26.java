package programmers;
//수박수박수박수박수?
public class Lv1_26 {

    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer.append("수");
            } else {
                answer.append("박");
            }
        }
        return String.valueOf(answer);
    }
}
