package programmers;
//최대공약수와 최소공배수
public class Lv1_42 {

    public static int[] solution(int n, int m) {
        int 최대공약수 = 0;
        int i = 1;
        while (i < Math.max(n, m)) {
            if (n % i == 0 && m % i == 0) {
                최대공약수 = i;
            }
            i++;
        }
        int[] answer = {최대공약수, n * m / 최대공약수};
        return answer;
    }

}
