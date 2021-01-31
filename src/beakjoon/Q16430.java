package beakjoon;
//2021.01.31
import java.util.Scanner;

public class Q16430 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int conut = num2 - num1;

        System.out.println(conut + " " + num2);
    }
}
