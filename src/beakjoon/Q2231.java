package beakjoon;
//분해합
import java.util.Scanner;

public class Q2231 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int 정답 = 1;

        for (int i = 1; i <= n; i++) {
            int 생성자 = 정답;
            int 임시값 = i;
            while (생성자 > 0) {
                임시값 += 생성자 % 10;
                생성자 /= 10;
            }
            if (임시값 == n) {
                정답 = i;
                System.out.println(정답);
                break;
            } else if (i == n) {
                System.out.println(0);
                break;
            }
            정답++;
        }
    }

}
