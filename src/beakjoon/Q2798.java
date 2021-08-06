package beakjoon;
//2021.08.05
//2021.08.07 성공

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2798 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        List<Integer> list = new ArrayList<>(num);
        int 기준 = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            list.add(scanner.nextInt());
        }
        int 정답 = 0;
        for (int i = 0; i < num - 2; i++) {

            for (int j = i + 1; j < num - 1; j++) {

                for (int k = j + 1; k < num; k++) {

                    int max = list.get(i) + list.get(j) + list.get(k);

                    if (기준 == max) {
                        정답 = max;
                        break;
                    }
                    if (정답 < max && max < 기준) {
                        정답 = max;
                    }
                }
            }
        }
        System.out.println(정답);
    }
}
