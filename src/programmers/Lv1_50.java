package programmers;

import java.util.ArrayList;
import java.util.List;

//가장 가까운 같은 글자
public class Lv1_50 {

    public static void main(String[] args) {
        System.out.println(solution("banana"));
    }

    public static List<Integer> solution(String s) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (i != 0) {
                int idx = s.substring(0, i).lastIndexOf(s.charAt(i));
                if (idx != -1) {
                    answer.add(i - idx);
                } else {
                    answer.add(idx);
                }
            } else {
                answer.add(-1);
            }
        }
        return answer;
    }

}
