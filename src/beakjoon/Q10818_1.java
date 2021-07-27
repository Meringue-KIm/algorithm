package beakjoon;
//2021.07.27
//ArrayList 활용

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q10818_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        System.out.println(Collections.min(arr) + " " + Collections.max(arr));
    }
}
