package beakjoon;
//2021.05.06
import java.util.Scanner;

public class Q7576 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        char ch = str.charAt(0);
        int 정답 = 10;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                정답 = 정답 + 5;
                ch = str.charAt(i);
            } else {
                정답 = 정답 + 10;
                ch = str.charAt(i);
            }
        }
        System.out.println(정답);
    }
}
