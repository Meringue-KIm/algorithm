package beakjoon;

import java.util.Scanner;
//2021.01.11
//평균은 넘겠지.. 어렵 준성이가 알려줌
public class Q4344 {
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            int 테스트케이스 = scanner.nextInt();
            while (테스트케이스-- > 0) {
                int 학생수 = scanner.nextInt();
                int[] 학생점수 = new int[학생수];
                int 점수합 = 0;
                for (int i = 0; i < 학생수; i++) {
                    int 점수 = scanner.nextInt();
                    점수합 += 점수;
                    학생점수[i] = 점수;
                }
                double 평균 = 점수합 / 학생수;
                int 평균넘는학생수 = 0;
                for (int 점수 : 학생점수) {
                    if (평균 < 점수) {
                        평균넘는학생수++;
                    }
                }
                double 정답 = (double) 평균넘는학생수 / 학생수 * 100;
                System.out.println(String.format("%.3f", 정답) + "%");
            }
        }
    }

