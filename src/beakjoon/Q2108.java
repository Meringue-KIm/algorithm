package beakjoon;

import java.util.*;

public class Q2108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int n = scanner.nextInt();
        double 합 = 0;

        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
            합 += list.get(i);
        }
        합 /= n;
        System.out.println((int) Math.round(합));

        Collections.sort(list);
        int 위치 = n / 2;
        System.out.println(list.get(위치));

        int[] arr = new int[8002];

        for (int i = 0; i < n; i++) {
            arr[list.get(i) + 4000]++;
        }
        int max = 0;
        for (int i : arr) {
            max = Math.max(i, max);
        }
        System.out.println(arr[max]);
        int count = 0;
        int min = list.get(0);

        int mm = Collections.max(list);

        while (min != mm) {
            if (min <= mm){
                min += 1;
                count++;
            }
        }
        System.out.println(count);
    }
}

