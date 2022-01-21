package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lv1_13 {

    public long solution(long n) {
        List<Long> list = new ArrayList<>();
        int count = 0;
        while (n > 0) {
            list.add(n % 10);
            n /= 10;
            count++;
        }
        Collections.sort(list);
        Collections.reverse(list);
        long value = 0;
        for (long l : list) {
            value += l * (long) Math.pow(10, count - 1);
            count--;
        }
        return value;
    }
}
