package beakjoon;

import java.util.Scanner;

public class Q9093 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            StringBuilder sb = new StringBuilder();
            String str = scanner.nextLine();
            String[] strArr = str.split(" ");
            for (int j = 0; j < strArr.length; j++) {
                char[] chArr = strArr[j].toCharArray();
                for (int k = chArr.length; 0 < k; k--) {
                    sb.append(chArr[k - 1]);
                }
                if (j != strArr.length - 1) {
                    sb.append(" ");
                }
            }
            System.out.println(sb);
        }
    }

}
