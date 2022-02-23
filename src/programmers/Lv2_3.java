package programmers;

import java.util.Arrays;

//가장 큰 수
//이해하기
public class Lv2_3 {

    public static String solution(int[] numbers) {
        String answer = "";
        String[] tmp = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            tmp[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(tmp, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
        if (tmp[0].equals("0")) {
            return "0";
        }
        for (String x : tmp) {
            answer += x;
        }
        return answer;
    }

}
