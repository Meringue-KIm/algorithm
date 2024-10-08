package beakjoon;

import java.util.Scanner;
// 전자레인지
public class Q10162 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int buttonA = 300;
        int buttonB = 60;
        int buttonC = 10;
        int countA = 0;
        int countB = 0;
        int countC = 0;

        if (number % buttonA == 0) {
            countA = number / buttonA;
            number = 0;
        } else {
            countA = number / buttonA;
            number %= buttonA;
        }

        if (number % buttonB == 0) {
            countB = number / buttonB;
            number = 0;
        } else if (number >= buttonB) {
            countB = number / buttonB;
            number %= buttonB;
        }

        if (number % buttonC == 0) {
            countC = number / buttonC;
            number = 0;
        } else if (number >= buttonC) {
            countC = number / buttonC;
            number %= buttonC;
        }

        if (number > 0) {
            System.out.println(-1);
        } else {
            System.out.println(countA + " " + countB + " " + countC);
        }

    }

}
