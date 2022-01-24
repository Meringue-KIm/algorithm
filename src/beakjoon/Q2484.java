package beakjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//주사위 네개
public class Q2484 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int cot = 0;
            int[] newArr = new int[6];
            for (int j = 0; j < 4; j++) {
                newArr[scanner.nextInt() - 1]++;
            }
            for (int k = 0; k < newArr.length; k++) {
                if (newArr[k] == 4) {
                    cot++;
                    list.add(50000 + ((k + 1) * 5000));
                } else if (newArr[k] == 3) {
                    cot++;
                    list.add(10000 + ((k + 1) * 1000));
                }
            }
            if (cot == 0) {
                int[] arr = new int[2];
                int count = 0;
                int number = 0;
                for (int l = 0; l < newArr.length; l++) {
                    if (newArr[l] == 2) {
                        arr[number] = l + 1;
                        count++;
                        number++;
                    }
                }
                if (count == 2) {
                    cot++;
                    list.add(2000 + (arr[0] * 500) + (arr[1] * 500));
                } else if (count == 1) {
                    cot++;
                    list.add(1000 + (arr[0] * 100));
                }
            }
            if (cot == 0) {
                int max = 0;
                for (int l = 0; l < newArr.length; l++) {
                    if (newArr[l] == 1) {
                        if (max < l) {
                            max = l;
                        }
                    }
                }
                list.add((max + 1) * 100);
            }
        }
        Collections.sort(list);
        System.out.println(list.get(t - 1));
    }

}
