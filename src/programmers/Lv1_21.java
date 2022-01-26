package programmers;

import java.util.Arrays;
import java.util.Collections;
//문자열 내림차순으로 배치하기
public class Lv1_21 {

    public String solution(String s) {
        Character[] chArr = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chArr[i] = s.charAt(i);
        }
        Arrays.sort(chArr, Collections.reverseOrder());
        StringBuilder answer = new StringBuilder();
        for (char c : chArr) {
            answer.append(c);
        }
        return answer.toString();
    }
}
