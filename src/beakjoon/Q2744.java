package beakjoon;
//2021.08.07
//2021.08.13

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2744 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Character> arr = new ArrayList<>();

        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            arr.add(str.charAt(i));

            if (Character.isUpperCase(arr.get(i))) {
                System.out.print(String.valueOf(arr.get(i)).toLowerCase());
            } else {
                System.out.print(String.valueOf(arr.get(i)).toUpperCase());
            }
        }
    }
}
