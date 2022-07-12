package programmers;

//22.07.11
//숫자의 표현
public class Lv2_10 {

    public static int solution(int n) {
        int count = 0;
        if (n == 1) {
            return 1;
        } else {
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 1; j <= n; j++) {
                    if (sum > n) {
                        break;
                    } else if (sum == n) {
                        System.out.println(sum);
                        count++;
                        break;
                    } else {
                        sum += j + i;
                    }
                }
            }
        }
        return count;
    }

}
