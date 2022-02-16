package beakjoon;

import java.util.Scanner;

public class zz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        String str = scanner.next();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);
            System.out.println(((char) arr[i]));
        }
    }

}
