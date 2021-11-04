package programmers;

import java.util.ArrayList;
import java.util.List;
//없는 숫자 더하기
public class Lv1_7 {
    public static int solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <= 9; j++) {
                if (numbers[i] == j) {
                    list.add(j);
                    System.out.println(j);
                }
            }
        }
        int answer = 0;
        for (int i : list) {
            answer += i;
        }
        return Math.abs(answer - 45);
    }

    public static void main(String[] args) {
        int[] arr1213 = {1, 2, 3, 4, 6, 7, 8, 0,};


        solution(arr1213);
    }
}
