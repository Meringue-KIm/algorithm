package beakjoon;
//2021.03.06
import java.util.Scanner;

public class Q4999 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        if (a.length() >= b.length()) {
            System.out.println("go");
        }else {
            System.out.println("no");
        }
    }
}
