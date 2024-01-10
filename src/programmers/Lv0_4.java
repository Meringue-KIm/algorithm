package programmers;
// 9로 나눈 나머지
public class Lv0_4 {

    public static int solution(String number) {
        int answer = 0;
        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            answer += Integer.parseInt(String.valueOf(ch));
        }
        return answer % 9;
    }

}
