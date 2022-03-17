package beakjoon;

import java.util.Scanner;

public class Q10820 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            int 소문자 = 0;
            int 대문자 = 0;
            int 숫자 = 0;
            int 공백 = 0;
            for (int i = 0; i < str.length(); i++) {
                char[] chArr = str.toCharArray();
                if (chArr[i] >= 97 && chArr[i] <= 122) {
                    소문자++;
                } else if (chArr[i] >= 65 && chArr[i] <= 90) {
                    대문자++;
                } else if (chArr[i] >= 48 && chArr[i] <= 57) {
                    숫자++;
                } else {
                    공백++;
                }
            }
            System.out.println(소문자 + " " + 대문자 + " " + 숫자 + " " + 공백);
        }
    }

}
