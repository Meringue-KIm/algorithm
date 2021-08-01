package beakjoon;
//2021.08.01
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2577_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();

        int 합 = 1;

        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(0);

        for (int i = 0; i < 3; i++) {
            int num = scanner.nextInt();
            합 *= num;
        }

        while (합 > 0) {
            int 끝자리수 = 합 % 10;
            합 /= 10;
            arr.set(끝자리수, arr.get(끝자리수) + 1);
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
