package study.week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// K번째수
public class Q2 {

    public static int[] solution(int[] array, int[][] ijk) {
        int[] arr = new int[ijk.length];
        for (int i = 0; i < arr.length; i++) {
            List<Integer> list = new ArrayList<>();
            int a = ijk[i][0];
            int b = ijk[i][1];
            int c = ijk[i][2];
            for (int j = a; j <= b; j++) {
                list.add(array[j - 1]);
            }
            Collections.sort(list);
            arr[i] = list.get(c - 1);
        }
        return arr;
    }

}
