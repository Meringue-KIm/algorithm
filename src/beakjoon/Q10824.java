package beakjoon;

import java.util.Scanner;

public class Q10824 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strArr = new String[4];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = scanner.next();
        }
        long a = Long.parseLong(strArr[0] + strArr[1]);
        long b = Long.parseLong(strArr[2] + strArr[3]);
        System.out.println(a + b);
    }

}
