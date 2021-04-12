package beakjoon;
//2021.04.12
import java.util.Scanner;

public class Q10103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int AA = 100;
        int BB = 100;

        for (int i = 0; i < n; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            if (A < B) {
                AA = AA - B;
            } else if (A == B) {
                continue;
            } else {
                BB = BB - A;
            }
        }
        System.out.println(AA);
        System.out.println(BB);
    }
}
