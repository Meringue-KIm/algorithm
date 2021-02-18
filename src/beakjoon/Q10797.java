package beakjoon;
//2021.02.18
import java.util.Scanner;

public class Q10797 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int 임시저장소 = 0;
        int count = 0;

        for (int i = 0; i < 5; i++) {
            임시저장소 = scanner.nextInt();
            if (num == 임시저장소) {
                count++;
            }
        }
        System.out.println(count);
    }
}
