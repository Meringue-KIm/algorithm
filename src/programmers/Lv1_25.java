package programmers;
//시저 암호
public class Lv1_25 {

    public static String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 65 && ch <= 90) {
                if (ch + n > 90) {
                    answer.append((char) (ch - 26 + n));
                } else {
                    answer.append((char) (ch + n));
                }
            } else if (ch >= 97 && ch <= 122) {
                if (ch + n > 122) {
                    answer.append((char) (ch - 26 + n));
                } else {
                    answer.append((char) (ch + n));
                }
            } else {
                answer.append(ch);
            }
        }
        return String.valueOf(answer);
    }

}
