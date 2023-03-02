package study.week2;

import java.util.PriorityQueue;

// 더 맵게
public class Q4 {

    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> que = new PriorityQueue<>();

        for (int j : scoville) {
            que.add(j);
        }
        while (que.peek() < K) {
            if (que.size() == 1)
                return -1;
            que.add(que.poll() + que.poll() * 2);
            answer++;
        }
        return answer;
    }

}
