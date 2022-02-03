package programmers;
//숫자 문자열과 영단어
public class Lv1_32 {

    public int solution(String s) {
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < strArr.length; i++) {
            s = s.replace(strArr[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }

}
