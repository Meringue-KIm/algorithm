package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//k번째 수
public class Lv1_10 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(solution(array, commands)));
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] arr = new int[commands.length];
        for (int i = 0; i < arr.length; i++) {
            List<Integer> list = new ArrayList<>();
            int a = commands[i][0];
            int b = commands[i][1];
            int c = commands[i][2];
            for (int j = a; j <= b; j++) {
                list.add(array[j - 1]);
            }
            Collections.sort(list);
            arr[i] = list.get(c - 1);
        }
        return arr;
    }
}
