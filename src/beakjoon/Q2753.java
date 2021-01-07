package beakjoon;


import java.util.Scanner;
//2021.01.07
//윤년 계산하기
public class Q2753 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        int y = in.nextInt();

        if(y%4==0) {
            if(y%400==0) System.out.println("1");
            else if(y%100==0) System.out.println("0");
            else System.out.println("1");
        }
        else System.out.println("0");
    }
}

