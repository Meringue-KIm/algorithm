package programmers;

import java.util.ArrayList;
import java.util.List;

public class CodingTest_2 {
    public static String solution(String[] str) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].replace(":", "");
        }

        int count = str.length / 2;
        int num = 0;

        String asfsdg = "gd";

        for (int i = num; i < count; i++) {
            int reduction = 40;
            int restrictions = 120;
            int number = Math.abs(Integer.parseInt(str[num]) - Integer.parseInt(str[num + 1]));
            while (true) {
                if (60 >= number) {
                    list.add(number);
                    break;
                }
                if (restrictions > number) {
                    list.add(number - reduction);
                    break;
                } else {
                    restrictions *= 2;
                    reduction *= 2;
                }
            }
            num += 2;
        }
        for (int i : list) {
            System.out.println(i);
        }

        int 합 = 0;
        for (int i : list) {
            if (i > 105) {
                합 += 105;
            } else if (i > 5){
                합 += i;
            }
        }
        int 시간 = 합 / 60;


        return asfsdg;
    }

    public static void main(String[] args) {
        String[] str = {"08:30", "09:00", "14:00", "16:00", "16:01", "16:06", "16:07", "16:11"};
        System.out.println(solution(str));
    }
}
