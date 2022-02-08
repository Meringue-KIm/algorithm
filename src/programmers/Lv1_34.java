package programmers;
//문자열 내 p와 y의 개수
public class Lv1_34 {

    public boolean solution(String s) {
        char[] ch = s.toCharArray();
        int p = 0;
        int y = 0;
        for (char c : ch) {
            if (c == 80 || c == 112) {
                p++;
            }
            if (c == 89 || c == 121) {
                y++;
            }
        }
        if (p == 0 && y == 0) {
            return true;
        } else if (p == y) {
            return true;
        } else {
            return false;
        }
    }
}
