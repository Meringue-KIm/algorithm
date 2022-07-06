package programmers;

//멀리뛰기 실패
//(dp공부)
public class Lv2_8 {

    public long solution(int n) {
        if (n == 1) {
            return 1;
        }
        long[] dp = new long[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = (dp[i - 2] + dp[i - 1]) % 1234567;
        }
        return dp[n - 1];
    }

    //다른 코드 답
    public int jumpCase(int num) {
        int answer = 0;
        int a = 0;
        int b = 1;
        for (int i = 0; i < num; i++) {
            answer = a + b;
            a = b;
            b = answer;
        }
        return answer;
    }

}
