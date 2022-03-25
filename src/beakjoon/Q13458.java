package beakjoon;

import java.util.Scanner;

//시험 감독
public class Q13458 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] 시험장 = new long[n];

        for (int i = 0; i < n; i++) {
            시험장[i] = scanner.nextLong();
        }
        long total = 0;
        long 총감독관 = scanner.nextLong();
        long 부감독관 = scanner.nextLong();

        for (int i = 0; i < n; i++) {
            if (시험장[i] <= 총감독관) {
                total++;
                continue;
            } else {
                시험장[i] -= 총감독관;
                total++;
            }

            long 나누기 = 시험장[i] / 부감독관;
            long 나머지 = 시험장[i] % 부감독관;
            if (나머지 > 0) {
                나누기++;
                total += 나누기;
            } else {
                total += 나누기;
            }
        }
        System.out.println(total);

    }
}
