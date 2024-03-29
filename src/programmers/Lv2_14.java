package programmers;
//124 나라의 숫자
//내가 직접 다시 풀기
public class Lv2_14 {

    public String solution(int n) {
        String[] numbers = {"4", "1", "2"};
        StringBuilder answer = new StringBuilder();
        int num = n;
        while (num > 0) {
            int remainder = num % 3;
            num /= 3;
            if (remainder == 0) num--;
            answer.insert(0, numbers[remainder]);
        }
        return answer.toString();
    }

}
