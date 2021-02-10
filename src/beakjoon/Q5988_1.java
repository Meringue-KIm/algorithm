package beakjoon;
//2021.02.10
//long으로도 받지 못하는 수를 형변환하여 푸는 방법
import java.util.Scanner;

public class Q5988_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T != 0) {
            String[] str = sc.next().split("");
            int num = Integer.parseInt(str[str.length - 1]);

            if (num % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
            T--;
        }
    }
}

