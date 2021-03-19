package beakjoon;
//2021.03.17
//2021.03.19 구글검색함
import java.util.Scanner;

public class Q2953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int index = 0;
        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                int score = sc.nextInt();
                sum += score;
                if (max <= sum) {
                    max = sum;
                    index = i + 1;
                }
            }
        }
        System.out.print(index + " " + max);
    }
}
