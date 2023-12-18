package programmers;

import java.util.ArrayList;
import java.util.List;

public class Lv0_2 {

    public static List<String> solution(String myStr) {
        List<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : myStr.toCharArray()) {
            if (ch == 'a' || ch == 'b' || ch == 'c') {
                if (sb.length() > 0) {
                    answer.add(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(ch);
            }
        }
        if (sb.length() > 0) {
            answer.add(sb.toString());
        }

        if (answer.isEmpty()) {
            return List.of("EMPTY");
        } else {
            return answer;
        }

    }

}
