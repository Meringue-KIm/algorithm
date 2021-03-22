package beakjoon;
//2021.03.22
//삽질중..
import java.util.Scanner;

public class Q2420_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int 작은수 = 0;
        int 큰수 = 0;
        int count = 0;

        if (N > M) {
            작은수 = M;
            큰수 = N;
        } else {
            작은수 = N;
            큰수 = M;
        }
        while (작은수 != 큰수) {
            작은수++;
            count++;
        }
        System.out.println(count);
    }
}
