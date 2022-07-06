package programmers;
//내적
//22.07.06
public class Lv1_46 {

    public int solution(int[] a, int[] b) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            max += a[i] * b[i];
        }
        return max;
    }

}
