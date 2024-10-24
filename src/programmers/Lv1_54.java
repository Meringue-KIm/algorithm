package programmers;

// 크기가 작은 부분 문자열
public class Lv1_54 {

    public int solution(String t, String p) {
        int len = p.length();
        long pLong = Long.parseLong(p);
        int cnt = 0;

        for (int i = 0; i < t.length() - len + 1; i++) {
            String str = t.substring(i, i + len);
            if (Long.parseLong(str) <= pLong) {
                cnt++;
            }
        }
        return cnt;
    }

}
