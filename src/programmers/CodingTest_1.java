package programmers;

import java.util.Arrays;

public class CodingTest_1 {

    public static int[] solution(int[] arr) {
        int[] result = new int[3];
        int max = 0;
        int count = 0;
        for (int i : arr) {
            if (i == 1) {
                result[0] += 1;
            } else if (i == 2) {
                result[1] += 1;
            } else {
                result[2] += 1;
            }
            count++;
            if (count == arr.length) {
                max = result[0];
                if (result[0] == result[1] && result[1] == result[2]) {
                    return new int[3];
                }
                if (max < result[1]) {
                    max = result[1];
                }
                if (max < result[2]) {
                    max = result[2];
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            int num = 0;
            for (int j = result[i]; j < max; j++) {
                if (result[i] != max) {
                    num++;
                }
            }
            result[i] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 3,3,3,3,3};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
