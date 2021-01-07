package beakjoon;


import java.util.Scanner;
//2021.01.07
//A+B - 3
public class Q10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A + B);
            System.out.println("수정");
        }
    }
}