package beakjoon;

import java.util.Scanner;
//2021.01.10
//더하기 사이클 준성이가 도와줌
public class Q1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int 입력받은수 = scanner.nextInt();
        int 임시저장소 = 입력받은수;
        int 사이클수 = 0;
        while (true) {
            사이클수++;
            int 첫번째자리 = 임시저장소 / 10;
            int 두번째자리 = 임시저장소 % 10;
            int 합 = (첫번째자리 + 두번째자리) % 10;
            int 새로운수 = (두번째자리 * 10) + 합;
            임시저장소 = 새로운수;
            if (임시저장소 == 입력받은수) {
                break;
            }
        }
        System.out.println(사이클수);
    }
}
