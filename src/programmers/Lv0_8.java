package programmers;
// 문자열 겹쳐쓰기
public class Lv0_8 {

    public static String solution(String my_string, String overwrite_string, int s) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (i == s) {
                for (int j = 0; j < overwrite_string.length(); j++) {
                    answer.append(overwrite_string.charAt(j));
                    i++;
                }
            }
            answer.append(my_string.charAt(i));
        }
        return answer.toString();
    }

}
