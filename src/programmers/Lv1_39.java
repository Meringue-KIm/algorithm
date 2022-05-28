package programmers;

import java.util.Arrays;

//문자열 내 마음대로 정렬하기
public class Lv1_39 {

    public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            char ch = strings[i].charAt(n);
            strings[i] = ch + strings[i];
        }
        Arrays.sort(strings);
        for (int i = 0; i < strings.length; i++) {
            answer[i] = "";
            for (int j = 1; j < strings[i].length(); j++) {
                answer[i] += strings[i].charAt(j);
            }
        }
        return answer;
    }

}
