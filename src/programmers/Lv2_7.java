package programmers;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

//프로그래머스 기능개발
public class Lv2_7 {

    public static void main(String[] args) {

    }

    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            queue.add(progresses[i]);
        }

        int count = 0;
        while (true) {

            int num = queue.poll();

        }


        //return answer;
    }

}
