package beakjoon;
//2021.08.05
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q2798 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        List <Integer> list = new ArrayList<>(num);
        int 기준 = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            list.add(scanner.nextInt());
        }

        List <Integer> list1 = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            if (list.get(i) < 기준) {
                list1.add(list.get(i));
            }
        }
        Collections.sort(list);
        System.out.println(Collections.max(list1));

    }
}
