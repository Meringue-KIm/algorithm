package beakjoon;

import java.util.Random;
import java.util.Scanner;

//2021.01.19
//숫자야구 연습중!
//2021.01.21 숫자야구 완성~~
public class Mission {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] 사람정답 = new int[3];
        int[] 랜덤정답 = new int[3];
        boolean loop = true;

        for (int i = 0; i < 랜덤정답.length; i++) {
            랜덤정답[i] = new Random().nextInt(10);
            for (int j = 0; j < i; j++) {
                if (랜덤정답[i] == 랜덤정답[j]) {
                    i--;
                }
            }
        }
        loop = true;
        while (loop) {
            for (int i = 0; i < 사람정답.length; i++) {
                사람정답[i] = scanner.nextInt();
            }

            for (int i = 0; i < 랜덤정답.length; i++) {
                System.out.println(랜덤정답[i]);
            }
            int 스트라이크존 = 0;
            int 볼존 = 0;

            for (int i = 0; i < 랜덤정답.length; i++) {
                for (int j = 0; j < 사람정답.length; j++) {
                    if (랜덤정답[i] == 사람정답[j] && i == j) {
                        스트라이크존++;
                    } else if (랜덤정답[i] == 사람정답[j] && i != j) {
                        볼존++;
                    }
                }
            }
            int 아웃존 = 3 - (스트라이크존 + 볼존);

            System.out.println(스트라이크존 + "스트라이크");
            System.out.println(볼존 + "볼");
            System.out.println(아웃존 + "아웃");

            if (스트라이크존 >= 3) {
                loop = false;
                System.out.println("승리");
                break;
            }
        }
    }
}


