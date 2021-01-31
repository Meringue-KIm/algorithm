package beakjoon;
//2021.01.31
import java.util.Scanner;

public class Q20499 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] str1 = str.split("/");

        String K1 = str1[0];
        String D1 = str1[1];
        String A1 = str1[2];

        int K = Integer.parseInt(K1);
        int D = Integer.parseInt(D1);
        int A = Integer.parseInt(A1);


        if (K + A < D || D == 0) {
            System.out.println("hasu");
        } else {
            System.out.println("gosu");
        }
    }
}