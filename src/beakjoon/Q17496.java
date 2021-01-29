package beakjoon;
//2021.01.29
import java.util.Scanner;

public class Q17496 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N여름기간 = scanner.nextInt();
        int T자라나는기간 = scanner.nextInt();
        int C빈칸 = scanner.nextInt();
        int P가격 = scanner.nextInt();

        int 바구니 = 0;
        int day = 1 + T자라나는기간;

        while (day <= N여름기간) {
            바구니 += C빈칸;
            day += T자라나는기간;
        }
        System.out.println(바구니 * P가격);
    }
}
