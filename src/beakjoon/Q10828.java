package beakjoon;
//2021.08.17
/*
  3가지 입출력 방법을 통해 성능을 비교해보려했으나 Scanner와 System.out.println()으로 매 번 출력하면 시간초과가 뜬다.
  제한 시간이 0.5초 (500ms)이기 때문에 그렇다.
  만약 Scanner를 쓰고싶다면 StringBuilder나 BufferedWriter을 쓰면 되는데, BufferedWriter을 쓸거면 이왕 BufferedReader을 쓰는게...
  여튼 아래 두 방식으로 풀어나갈 것이다.
 */
//재해석하기
import java.util.Scanner;

public class Q10828 {

    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = in.nextInt();

        stack = new int[N];

        for (int i = 0; i < N; i++) {

            String str = in.next();

            switch (str) {

                case "push":
                    push(in.nextInt());
                    break;

                case "pop":
                    sb.append(pop()).append('\n');
                    break;

                case "size":
                    sb.append(size()).append('\n');
                    break;

                case "empty":
                    sb.append(empty()).append('\n');
                    break;

                case "top":
                    sb.append(top()).append('\n');
                    break;
            }

        }
        System.out.println(sb);
    }

    public static void push(int item) {
        stack[size] = item;
        size++;
    }

    public static int pop() {
        if (size == 0) {
            return -1;
        } else {
            int res = stack[size - 1];
            stack[size - 1] = 0;
            size--;
            return res;
        }
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if (size == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int top() {
        if (size == 0) {
            return -1;
        } else {
            return stack[size - 1];
        }
    }
}
