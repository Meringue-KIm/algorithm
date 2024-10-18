package beakjoon;

import java.util.Scanner;

// 한조서열정리하고옴ㅋㅋ
public class Q14659 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] heights = new int[N];

        for (int i = 0; i < N; i++) {
            heights[i] = scanner.nextInt();
        }

        int maxCount = 0;
        int currentCount = 0;

        for (int i = 1; i < N; i++) {
            if (heights[i - 1] > heights[i]) {
                currentCount++;
            } else {
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 0;
            }
        }

        // 마지막 카운트를 확인
        maxCount = Math.max(maxCount, currentCount);

        System.out.println(maxCount);
    }

}
