package beakjoon;
//2021.08.20
//LinkedList 활용 맞춤
import java.util.LinkedList;
import java.util.Scanner;

public class Q1158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> List = new LinkedList<>();
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            List.add(i);
        }

        System.out.print("<");

        while (!List.isEmpty()) {
            for (int i = 0; i < K; i++) {
                if (i == K - 1) {
                    int a = List.remove();
                    if (List.size() == 0) {
                        System.out.print(a);
                    } else {
                        System.out.print(a + ", ");
                    }
                } else {
                    List.add(List.remove());
                }
            }
        }
        System.out.print(">");
    }
}
