package beakjoon;
//2021.02.08
//아직 안풀었음
//StringBuilder().append(A).reverse().toString() 공부하기
//2021.02.12 풀었음
import java.util.Scanner;

public class Q2908 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        in.close();

        A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
        B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());

        System.out.print(A > B ? A : B);
    }
}