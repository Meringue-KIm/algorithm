package beakjoon;
//2021.05.11
import java.util.Scanner;

public class Q5032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int e = scanner.nextInt(); //현재 수량
        int f = scanner.nextInt(); //새로 발견한 수량
        int c = scanner.nextInt(); //필요 수량

        int sum = 0;
        int count = 0;

        if (e + f < c) {
            System.out.println(0);
        } else {
            sum = e + f;
            while (sum >= c) {
                sum = sum - c;
                count++;
            }
            while (count )
            System.out.println(count);
        }
    }
}
