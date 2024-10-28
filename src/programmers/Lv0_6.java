package programmers;

// 배열의 평균값
public class Lv0_6 {

    public double solution(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }

}
