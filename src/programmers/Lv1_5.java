package programmers;

public class Lv1_5 {
    public static double solution(int[] arr) {
        int num = 0;
        for (int i : arr) {
            num += i;
        }
        return (double) num / arr.length;
    }
}
