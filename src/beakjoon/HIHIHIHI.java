package beakjoon;

import java.util.Scanner;
// 다 못풀었음
//2839 설탕가게 다시 풀기
public class HIHIHIHI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count5 = 0;
        int count3 = 0;
        int numnum = num;

        while (num % 5 == 0 || num % 3 == 0) {
            if (num % 5 == 0) {
                count5++;
            }
            if (num % 3 == 0) {
                count3++;
            } else {
                System.out.println(-1);
                break;
            }
        }
        if (count5 + count3 != 0) {
            System.out.println(count5 + count3);
        }
    }
}
