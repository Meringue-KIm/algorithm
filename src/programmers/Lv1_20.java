package programmers;

import java.util.HashSet;
import java.util.Set;

//폰켓몬
public class Lv1_20 {

    public int solution(int[] nums) {
        int get = nums.length / 2;
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        return Math.min(set.size(), get);
    }

}
