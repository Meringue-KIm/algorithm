package programmers;

import java.util.ArrayList;
import java.util.List;
//짝지어 제거하기 (효율성 테스트에서 떨어짐..)
//스택 활용해야함
public class Lv2_2 {

    public static int solution(String s) {
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }

        int count = 1;

        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            if (count < list.size()) {
                if (list.get(count) == ch) {
                    list.remove(count);
                    list.remove(i);
                    count = 0;
                    i = -1;
                }
            }
            count++;
        }

        if (list.size() == 0) {
            return 1;
        } else {
            return 0;
        }

    }

}
