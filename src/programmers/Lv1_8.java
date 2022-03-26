package programmers;

//로또의 최고 순위와 최저 순위
public class Lv1_8 {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int winNumberCount = 0;
        int zeroCount = 0;
        for (int win_num : win_nums) {
            for (int lotto : lottos) {
                if (win_num == lotto) {
                    winNumberCount++;
                }
            }
        }
        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCount++;
            }
        }
        int newWinNumberCount = winNumberCount;

        if (zeroCount > 0) {
            for (int i = 0; i < zeroCount; i++) {
                winNumberCount++;
            }
        }
        int maxCount = 1;
        int minCount = 1;
        for (int i = 6; i > 0; i--) {
            if (winNumberCount == i) {
                answer[0] = maxCount;
            } else if (winNumberCount == 0) {
                answer[0] = maxCount;
            }
            maxCount++;
            if (newWinNumberCount == i) {
                answer[1] = minCount;
            } else if (newWinNumberCount == 0) {
                answer[1] = minCount;
            }
            minCount++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] warr = {7, 8, 9, 10, 11, 12};

        int[] arr1 = solution(arr, warr);

        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}
