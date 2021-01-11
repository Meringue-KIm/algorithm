package beakjoon;

import java.util.Scanner;
//2021.01.11
//OX퀴즈
public class Q8958 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int 테스트케이스 = Integer.parseInt(scanner.nextLine());
        while (테스트케이스-- > 0) {
            String 입력 = scanner.nextLine();
            int 연속된횟수 = 1;
            int 정답 = 0;
            for (int i = 0; i < 입력.length(); i++) {
                if (입력.charAt(i) == 'X') {
                    연속된횟수 = 1;
                    continue;
                }
                정답 += 연속된횟수++;
            }
            System.out.println(정답);
        }
    }

}

