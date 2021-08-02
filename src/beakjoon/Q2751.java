package beakjoon;
//2021.08.02
import java.util.*;

public class Q2751 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = scanner.nextInt();

        List<Integer> arr = new ArrayList<>(num);

        for (int i = 0; i < num; i++) {
            arr.add(scanner.nextInt());
        }

        Collections.sort(arr);

        for (int i : arr) {
            sb.append(i).append('\n');
        }
        System.out.println(sb);
    }
}
