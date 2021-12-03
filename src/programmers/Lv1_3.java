package programmers;
//핸드폰 번호 가리기
public class Lv1_3 {
    public static String solution(String phone_number) {
        int num = phone_number.length() - 4;
        StringBuilder answer = new StringBuilder();
        for (int j = 0; j < num; j++) {
            answer.append("*");
        }

        for (int i = num; i < phone_number.length(); i++) {
            char ch = phone_number.charAt(i);
            answer.append(String.valueOf(ch));
        }
        return answer.toString();
    }
}
