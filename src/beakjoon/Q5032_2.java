package beakjoon;

import java.util.Scanner;

public class Q5032_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int 빈병 = scanner.nextInt() + scanner.nextInt();
        int 필요한빈병 = scanner.nextInt();
        int count = 0;

        while (빈병 >= 필요한빈병) {
            int 음료수 = 빈병 / 필요한빈병;
            count += 음료수;
            빈병 = 음료수 + (빈병 % 필요한빈병);
        }
        System.out.println(count);
    }
}
