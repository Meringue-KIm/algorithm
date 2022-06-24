package beakjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q11586 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            list.add(scanner.next());
        }
        int n = scanner.nextInt();

        if (n == 1) {
            for (String s : list) {
                System.out.println(s);
            }
        } else if (n == 2) {
            for (String s : list) {
                StringBuilder sb = new StringBuilder(s);
                System.out.println(sb.reverse());
            }
        } else {
            for (int i = t - 1; i >= 0; i--) {
                System.out.println(list.get(i));
            }
        }
    }

}
