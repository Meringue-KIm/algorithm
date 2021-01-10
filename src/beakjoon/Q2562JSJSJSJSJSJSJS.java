package beakjoon;

import java.util.Scanner;
//2021.01.09
//준성이가 알랴준 최댓값
public class Q2562JSJSJSJSJSJSJS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0; //최댓값 저장소
        int b = 0; //몇번째 입력값 저장소

        for(int i = 1; i <= 9; i++) {
            int c = sc.nextInt();
            if(a<c) {
                b = i;
                a = c;
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}
