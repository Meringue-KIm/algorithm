package programmers;

import java.util.ArrayList;
import java.util.List;

//자연수 뒤집어 배열로 만들기
public class Lv1_15 {

    public List<Long> solution(long n) {
        List<Long> list = new ArrayList<>();
        while (n > 0) {
            long num = n % 10;
            list.add(num);
            n /= 10;
        }
        return list;
    }
}
