package programmers;

//콜라츠 추측
public class Lv1_6 {
    public static long solution(long num) {
        long answer = 0;
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
                answer++;
            } else if (num % 2 == 1) {
                num = (num * 3) + 1;
                answer++;
            }

            if (answer > 500) {
                answer = -1;
                return answer;
            }
        }
        return answer;
    }
}
