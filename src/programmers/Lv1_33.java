package programmers;

import java.util.*;
//신고 결과 받기
//실패..
public class Lv1_33 {

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        System.out.println(Arrays.toString(solution(id_list, report, k)));
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        Set<String> set = new HashSet<>();
        Map<String, Set<String>> map = new HashMap<>();

        for (String value : report) {
            String[] str = value.split(" ");
            set.add(str[1]);
            for (String s : id_list) {
                map.put(s, set);
            }
        }
        Map<String, Integer> map1 = new HashMap<>();

        for (String s : id_list) {
            map1.put(s, 0);
        }

        for (String value : id_list) {
            for (int j = 0; j < map.get(value).size(); j++) {
                if (map.get(value).contains(id_list[j])) {
                    map1.put(id_list[j], map1.get(id_list[j]) + 1);
                }
            }
        }

        Map<String, Integer> map2 = new HashMap<>();
        for (String s : id_list) {
            if (map1.get(s) >= k) {
                for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
                    int count = 0;
                    if (entry.getValue().contains(s)) {
                        map2.put(entry.getKey(), count + 1);
                    }
                }
            }
        }
        int[] arr = new int[id_list.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map2.get(id_list[i]);
        }
        return arr;
    }
}
