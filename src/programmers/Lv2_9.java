package programmers;

import java.util.*;

public class Lv2_9 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(20, 5)));
    }

    public static int[] solution(int n, long k) {
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
            sb.append(i);
        }
        list.add(String.valueOf(sb));
        System.out.println(sb);
        list.add(String.valueOf(sb.reverse()));
        int count = 0;
        while (true) {
            sb = new StringBuilder();
            int a = queue.remove();
            queue.add(a);
            for (int i : queue) {
                sb.append(i);
            }
            if (String.valueOf(list.get(0)).equals(String.valueOf(sb)) || String.valueOf(list.get(1)).equals(String.valueOf(sb))) {
                if (count == 1) {
                    break;
                } else {
                    queue.clear();
                    for (int i = n; i > 0; i--) {
                        queue.add(i);
                    }
                    count++;
                }
            } else {
                StringBuilder s = new StringBuilder();
                for (int i : queue) {
                    s.append(i);
                }
                list.add(String.valueOf(s));
            }
        }
        Collections.sort(list);
        String s = list.get((int) k - 1);
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = s.charAt(i) - '0';
        }
        return answer;
    }

}
