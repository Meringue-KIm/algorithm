package programmers;
//약수의 합
public class Lv1_29 {

    public static int solution(int n) {
        int sum = n;
        for (int i = 1; i <= n / 2; i++) {
            for (int j = n; 0 <= j; j--) {
                if (i * j == n) {
                    System.out.println(i);
                    sum += i;
                }
            }
        }
        return sum;
    }
}
