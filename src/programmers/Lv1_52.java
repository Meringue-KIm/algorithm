package programmers;

// 크기가 작은 부분 문자열
public class Lv1_52 {

    public int solution(String t, String p) {
        long pNum = Long.parseLong(p);
        int answer = 0;
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            String temp = t.substring(i, i + p.length());
            if (Long.parseLong(temp) <= pNum) {
                answer++;
            }
        }
        return answer;
    }
    
}
