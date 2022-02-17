package beakjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10870 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        int num0 = 0;
        int num1 = 1;
        list.add(num0 + num1);

        if (n != 0) {
            for (int i = 0; i < n - 2; i++) {
                list.add(list.get(i) + num1);
                num1 = list.get(i);
            }
        } else {
            list.add(0);
        }
        System.out.println(list.get(list.size() - 1));
    }

}