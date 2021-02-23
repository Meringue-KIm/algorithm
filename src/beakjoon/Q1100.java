package beakjoon;
//2021.02.22 내일 다시 풀기
//2021.02.23 준성이 풀이
import java.util.Scanner;

public class Q1100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean 첫번째칸하얀색시작 = false;
        int count = 0;
        for (int i = 0; i < 8; i++) {
            String str = scanner.nextLine();
            첫번째칸하얀색시작 = !첫번째칸하얀색시작;
            for (int j = 0; j < 8; j++) {
                char c = str.charAt(j);
                if (c == 'F') {
                    if (첫번째칸하얀색시작 && j % 2 == 0) {
                        count++;
                    } else if (!첫번째칸하얀색시작 && j % 2 == 1) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}