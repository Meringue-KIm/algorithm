package programmers;

public class Lv2_5 {

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
            if (chars[i] <= 57 && chars[i] >= 48) {
                sb.append(chars[i]);
            } else if (chars[i] == 32) {
                sb.append(chars[i]);
            } else {
                if (i >= 1) {
                    if (chars[i - 1] == 32) {
                        sb.append((char) (chars[i] - 32));
                    } else {
                        sb.append(chars[i]);
                    }
                } else {
                    sb.append((char) (chars[i] - 32));
                }
            }
        }
        return String.valueOf(sb);
    }

}
