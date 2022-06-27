package beakjoon;

import java.util.*;

public class Q5635 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String[] str = new String[t];
        int[][] arr = new int[t][3];
        for (int i = 0; i < t; i++) {
            str[i] = scanner.next();
            arr[i][2] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
            arr[i][0] = scanner.nextInt();
        }
        int max = 0;
        int min = 99999999;
        int maxIndex = -1;
        int minIndex = -1;
        List<Integer> maxList = new ArrayList<>();
        List<Integer> minList = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                if (arr[j][0] > max) {
                    maxIndex = j;
                    max = arr[j][0];
                    maxList.add(0, arr[j][0]);
                    maxList.add(1, arr[j][1]);
                    maxList.add(2, arr[j][2]);
                }
                if (arr[j][0] < min) {
                    minIndex = j;
                    min = arr[j][0];
                    minList.add(0, arr[j][0]);
                    minList.add(1, arr[j][1]);
                    minList.add(2, arr[j][2]);
                }
            }
            for (int j = 0; j < t; j++) {
                if (max == arr[j][0]) {
                    if (maxList.get(1) < arr[j][1]) {
                        maxIndex = j;
                        max = arr[j][0];
                        maxList.add(0, arr[j][0]);
                        maxList.add(1, arr[j][1]);
                        maxList.add(2, arr[j][2]);
                    } else if (maxList.get(1) == arr[j][1]) {
                        if (maxList.get(2) < arr[j][2]) {
                            maxIndex = j;
                            max = arr[j][0];
                            maxList.add(0, arr[j][0]);
                            maxList.add(1, arr[j][1]);
                            maxList.add(2, arr[j][2]);
                        }
                    }
                }
                if (min == arr[j][0]) {
                    if (minList.get(1) > arr[j][1]) {
                        minIndex = j;
                        min = arr[j][0];
                        minList.add(0, arr[j][0]);
                        minList.add(1, arr[j][1]);
                        minList.add(2, arr[j][2]);
                    } else if (minList.get(1) == arr[j][1]) {
                        if (minList.get(2) > arr[j][2]) {
                            minIndex = j;
                            min = arr[j][0];
                            minList.add(0, arr[j][0]);
                            minList.add(1, arr[j][1]);
                            minList.add(2, arr[j][2]);
                        }
                    }
                }
            }
        }
        System.out.println(str[maxIndex]);
        System.out.println(str[minIndex]);
    }

}
