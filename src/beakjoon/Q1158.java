package beakjoon;
//2021.08.20
//LinkedList 활용 맞춤
//2021.08.21
//LinkedList 활용

import java.util.LinkedList;
import java.util.Scanner;

public class Q1158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        System.out.print("<");

        while (!list.isEmpty()) {
            for (int i = 0; i < K; i++) {
                int a = list.remove();
                if (i == K - 1) {
                    if (list.size() == 0) {
                        System.out.print(a);
                    } else {
                        System.out.print(a + ", ");
                    }
                } else {
                    list.add(a);
                }
            }
        }
        System.out.print(">");
    }
}
