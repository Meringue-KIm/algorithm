package programmers;
//부족한 금액 계산하기
public class Lv1_31 {

    public long solution(int price, int money, int count) {
        long num = money;
        for (int i = 1; i <= count; i++) {
            num -= (long) price * i;
        }
        if (num < 0) {
            return Math.abs(num);
        } else {
            return 0;
        }
    }

}
