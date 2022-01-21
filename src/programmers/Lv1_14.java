package programmers;

//제일 작은 수 제거하기
public class Lv1_14 {

    public int[] solution(int[] arr) {
        int[] numberArr = new int[arr.length - 1];
        int minValue = 999999999;
        if (numberArr.length == 0) {
            numberArr = new int[1];
            numberArr[0] = -1;
        } else {
            for (int i : arr) {
                minValue = Math.min(i, minValue);
            }
            int count = 0;
            for (int j : arr) {
                if (j != minValue) {
                    numberArr[count] = j;
                    count++;
                }
            }
        }
        return numberArr;
    }
}
