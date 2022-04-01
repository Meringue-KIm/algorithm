package beakjoon;

import java.util.Scanner;

public class Q11945 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        char[] arr = new char[m1];
        if (m1 != 0) {
            for (int i = 0; i < n1; i++) {
                int z = 1;
                String str = scanner.next();
                for (int j = 0; j < m1; j++) {
                    arr[j] = str.charAt(m1 - z);
                    z++;
                }
                for (char k : arr) {
                    System.out.print(k);
                }
                System.out.println();
            }
        }
    }
}
