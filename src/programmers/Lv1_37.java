package programmers;

import java.util.ArrayList;
import java.util.List;
//모의고사
public class Lv1_37 {

    public static int[] solution(int[] answers) {
        List<int[]> list = new ArrayList<>();
        int[] user1 = {1, 2, 3, 4, 5};
        int[] user2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] user3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        list.add(user1);
        list.add(user2);
        list.add(user3);
        int[] arr = new int[3];
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == user1[i % user1.length]) {
                count1++;
            }
            if (answers[i] == user2[i % user2.length]) {
                count2++;
            }
            if (answers[i] == user3[i % user3.length]) {
                count3++;
            }
        }
        int max = Math.max(Math.max(count1, count2), count3);
        int[] answer;
        if (count1 == count2 && count1 == count3) {
            return answer = new int[]{1, 2, 3};
        } else if (count1 == count2 && count1 > count3) {
            return answer = new int[]{1, 2};
        } else if (count1 == count3 && count1 > count2) {
            return answer = new int[]{1, 3};
        } else if (count2 == count3 && count2 > count1) {
            return answer = new int[]{2, 3};
        } else {
            if (max == count3) {
                return answer = new int[]{3};
            } else if (max == count2) {
                return answer = new int[]{2};
            } else {
                return answer = new int[]{1};
            }
        }
    }

}
