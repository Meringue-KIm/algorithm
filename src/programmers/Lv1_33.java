package programmers;

import java.util.*;

//신고 결과 받기
//22.07.07 다시풀기 (성공)
public class Lv1_33 {

    public static void main(String[] args) {
        String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;
        System.out.println(Arrays.toString(solution(id_list, report, k)));
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Set<String>> users = new HashMap<>();
        Map<String, Integer> reportCount = new HashMap<>();
        for (String s : id_list) {
            users.put(s, new HashSet<>());
            reportCount.put(s, 0);
        }
        for (String value : report) {
            String[] ab = value.split(" ");
            users.get(ab[0]).add(ab[1]);
        }
        for (String value : id_list) {
            for (String s : users.get(value)) {
                reportCount.put(s, reportCount.get(s) + 1);
            }
        }
        int[] arr = new int[id_list.length];
        for (String s : id_list) {
            if (reportCount.get(s) >= k) {
                for (int j = 0; j < users.size(); j++) {
                    if (users.get(id_list[j]).contains(s)) {
                        arr[j]++;
                    }
                }

            }
        }
        return arr;
    }

}
