package programmers;
//자릿수 더하기
public class Lv_11 {

    public static int solution(int n) {
        int sum = 0;
        while (n > 0) {
            int num = n % 10;
            sum += num;
            n /= 10;
        }
        return sum;
    }
}
