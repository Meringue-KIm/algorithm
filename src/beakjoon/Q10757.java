package beakjoon;
//2021.02.19
//BigInteger 사용
import java.math.BigInteger;
import java.util.Scanner;

public class Q10757 {
    public static void main(String[] args) {
        BigInteger A = new BigInteger("0");
        BigInteger B = new BigInteger("0");

        BigInteger num = new BigInteger("0");

        Scanner scanner = new Scanner(System.in);

        A = scanner.nextBigInteger();
        B = scanner.nextBigInteger();

        num = num.add(A);
        num = num.add(B);

        System.out.println(num);
    }
}
