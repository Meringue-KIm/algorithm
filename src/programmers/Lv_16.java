package programmers;
//이상한 문자 만들기
public class Lv_16 {

    public static String solution(String s) {
        StringBuilder value = new StringBuilder();
        String[] str = s.split(" ", -1);
        for (int i = 0; i < str.length; i++) {
            char[] ch = str[i].toCharArray();
            for (int j = 0; j < ch.length; j++) {
                if (j % 2 == 0) {
                    if (ch[j] >= 97 && ch[j] <= 122) {
                        ch[j] = (char) (ch[j] - 32);
                    }
                } else {
                    if (ch[j] >= 65 && ch[j] <= 90) {
                        ch[j] = (char) (ch[j] + 32);
                    }
                }
            }
            if (i < str.length - 1) {
                for (char c : ch) {
                    value.append(c);
                }
                value.append(" ");
            } else {
                for (char c : ch) {
                    value.append(c);
                }
            }
        }
        return value.toString();
    }
}
