package beakjoon;

import java.util.Scanner;
//2021.01.09
//준성이가 알랴준 최댓값
public class Q2562JSJSJSJSJSJSJS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;

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
