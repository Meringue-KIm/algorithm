package programmers;
// 369게임
public class Lv0_3 {

    public int solution(int order) {
        int count = 0;
        while (order > 0) {
            int b = order % 10;
            if (b == 3 || b == 6 || b == 9) {
                count++;
            }
            order /= 10;
        }
        return count;
    }

}
