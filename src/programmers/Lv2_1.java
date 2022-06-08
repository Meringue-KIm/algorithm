package programmers;

public class Lv2_1 {

    public static String solution(String s) {
        String[] strArr = s.split(" ");
        int max = Integer.parseInt(strArr[0]);
        int min = Integer.parseInt(strArr[0]);

        for (String value : strArr) {
            int num = Integer.parseInt(value);
            if (max <= num) {
                max = num;
            }
            if (min >= num) {
                min = num;
            }
        }
        return min + " " + max;
    }

}
