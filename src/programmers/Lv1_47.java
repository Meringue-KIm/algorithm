package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//22.07.15
//실패율
public class Lv1_47 {

    public static List<Integer> solution(int N, int[] stages) {
        List<Integer> answer = new ArrayList<>();
        double[] arr = new double[N];
        for (int i = 0; i < N; i++) {
            double a = 0;
            double b = 0;
            for (int stage : stages) {
                if (stage == i + 1) {
                    a++;
                }
                if (stage >= i + 1) {
                    b++;
                }
            }
            if (a == 0 && b == 0) {
                arr[i] = 0.0;
            } else {
                arr[i] = a / b;
            }
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            double max = -1;
            int maxIndex = 0;
            if (count >= 1) {
                count--;
                continue;
            }
            for (int j = 0; j < arr.length; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < arr.length; j++) {
                if (max == arr[j] && maxIndex != j) {
                    list.add(j);
                    count++;
                }
            }
            if (list.size() == 0) {
                answer.add(maxIndex + 1);
            } else {
                list.add(maxIndex);
                Collections.sort(list);
                for (Integer integer : list) {
                    answer.add(integer + 1);
                }
            }
            for (int j = 0; j < arr.length; j++) {
                if (max == arr[j]) {
                    arr[j] = -2;
                }
            }
        }
        return answer;
    }

}
