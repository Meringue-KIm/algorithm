package beakjoon;

import java.util.Scanner;
//2021.01.07
public class Q2742 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=N; i >= 1; i--) {
            System.out.println(i);
        }
        // for문이 3 부분ㅇ잖아.
        // 첫번째는 i 시작할 숫자 정의
        // 두번째는 반복되는 조건
        // 세번째는 증가값인데
        // N부터 1까지잖아
        // N부터 시작해야하니까 i를 N으로 하고
        // 1까지 돌아야하잖아.
         //근데 i--야. 한번돌때마다 i가 1씩까여.
        //i가 1보다 크거나 같아야지.
        // 그래서 조건을 i > 0 또는 i >= 1 이렇게 해줘야
        // N부터 1씩 까이면서 1까지 도는거임.
    }
}
