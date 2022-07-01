package programmers;

import java.util.LinkedList;
import java.util.Queue;
//멀리뛰기 실패
public class Lv2_8 {

    public static void main(String[] args) {
        System.out.println(solution(6));
    }

    public static long solution(int n) {
        Queue<String> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (sum != n) {
            queue.add("1");
            sb.append("1");
            if (sum < n) {
                queue.add("1");
                sb.append("1");
                sum += 1;
            }
            if (sum + 2 <= n) {
                queue.add("2");
                sb.append("2");
                sum += 2;
            }
        }
        int count = 1;
        if (n % 2 == 0) {
            count = 2;
        }
        System.out.println(sb);

        StringBuilder s = new StringBuilder();
        while (true) {
            String str = queue.remove();
            queue.add(str);
            for (String value : queue) {
                s.append(value);
            }
            System.out.println(s);
            count++;
            if (String.valueOf(sb).equals(s.toString())) {
                break;
            }
            s = new StringBuilder();
        }

        return count % 1234567;
    }
}
