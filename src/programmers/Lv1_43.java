package programmers;

public class Lv1_43 {

    public static void main(String[] args) {
        solution(13, 17);
    }

    public static int solution(int left, int right) {
        int total = right - left;
        int sum = 0;
        for (int i = 0; i <= total; i++) {
            int number = left + i;
            int count = 0;
            for (int j = 1; j <= number; j++) {
                if (number % j == 0) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                sum += number;
            } else {
                sum -= number;
            }
            System.out.println(sum);
        }
        return sum;
    }


}
