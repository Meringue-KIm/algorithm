package programmers;

import java.util.ArrayList;
import java.util.List;

// 추억 점수
public class Lv1_51 {

    public static List<Integer> solution(String[] name, int[] yearning, String[][] photo) {
        List<Integer> answer = new ArrayList<>();

        for (String[] strings : photo) {
            int sum = 0;
            for (String string : strings) {
                for (int k = 0; k < name.length; k++) {
                    if (string.equals(name[k])) {
                        sum += yearning[k];
                    }
                }
            }
            answer.add(sum);
        }
        return answer;
    }

}
