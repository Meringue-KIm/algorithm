package programmers;
//하샤드 수
import java.util.ArrayList;
import java.util.List;

public class Lv1_4 {
    public boolean solution(int x) {
        List<Integer> list = new ArrayList<>();
        int num = x;
        while (num > 0) {
            list.add(num % 10);
            num = num / 10;
        }
        int max = 0;

        for (int i : list) {
            max += i;
        }
        return x % max == 0;
    }
}
