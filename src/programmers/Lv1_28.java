package programmers;
//가운데 글자 가져오기 // substring 쓰면 더 좋나?
public class Lv1_28 {

    public String solution(String s) {
        StringBuilder str = new StringBuilder();
        int num;
        if (s.length() % 2 == 0) {
            num = s.length() / 2 - 1;
            for (int i = num; i <= num + 1; i++) {
                str.append(s.charAt(i));
            }
        } else {
            num = s.length() / 2;
            str.append(s.charAt(num));
        }
        return String.valueOf(str);
    }

}
