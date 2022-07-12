package programmers;

import java.util.Arrays;
//숫자 블록 (실패)
public class Lv2_11 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2, 10)));
    }

    public static int[] solution(long begin, long end) {
        int[] arr = new int[((int) end - (int) begin) + 1];
        for (int i = (int) begin; i <= arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((long) i * (j + 2) <= end) {
                    arr[(i * (j + 2)) - (int) begin] = i;
                }
            }
        }
        return arr;
    }

}
