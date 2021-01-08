package beakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q2562 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int 최대값저장 = 0;
        int 몇번째인지저장 = 0;

        for (int i = 1; i <= 9; i++) {
            int 입력받은숫자 = scanner.nextInt();
            if (최대값저장 < 입력받은숫자) {
                몇번째인지저장 = i;
                최대값저장 = 입력받은숫자;
            }
        }
        System.out.println(최대값저장);
        System.out.println(몇번째인지저장);
    }
}
