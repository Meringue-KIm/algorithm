package beakjoon;

import java.util.Random;
import java.util.Scanner;
//2021.01.19
//숫자야구 연습중!
public class Mission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] 사람정답 = new int[3];
        int[] 랜덤정답 = new int[3];

        for (int i = 0; i < 사람정답.length; i++) {
            사람정답[i] = scanner.nextInt();
            랜덤정답[i] = new Random().nextInt(10);
        }
        System.out.println(사람정답[2]);
    }
}
