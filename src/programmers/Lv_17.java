package programmers;

public class Lv_17 {

    public long solution(long n) {
        long value = 0;
        long count = 1;
        while (count <= n) {
            long number = count * count;
            if (number <= n) {
                if (number == n) {
                    value = (count + 1) * (count + 1);
                    break;
                } else {
                    count++;
                }
            } else {
                return -1;
            }
        }
        return value;
    }
}
