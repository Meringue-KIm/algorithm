package beakjoon;

import java.util.Scanner;

// 세로읽기
public class Q10798 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        String[][] arr = new String[5][15];

        for (int i = 0; i < 5; i++) {
            String str = scanner.nextLine();
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = String.valueOf(str.charAt(j));
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] != null) {
                    stringBuilder.append(arr[j][i]);
                }
            }
        }
        System.out.println(stringBuilder);
    }

}
