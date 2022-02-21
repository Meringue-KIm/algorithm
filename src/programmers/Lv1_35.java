package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lv1_35 {

    public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int j : arr) {
            if (j % divisor == 0) {
                list.add(j);
            }
        }
        if (list.size() == 0) {
            list.add(-1);
        }
        Collections.sort(list);
        return list;
    }

}
