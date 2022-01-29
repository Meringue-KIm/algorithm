package programmers;
//문자열 다루기 기본
public class Lv1_30 {

    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch <= 47 || ch >= 58) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

}
