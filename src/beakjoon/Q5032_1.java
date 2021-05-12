package beakjoon;

import java.util.Scanner;

//2021.05.12
//구글링 했는데 이것도 틀림;
public class Q5032_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        int c = scanner.nextInt();

        int sum = e + f;
        int num = 0; //그날 마신 빈병의 갯수가 저장되는곳;
        int count = 0; //마실 수 있는 병수가 저장될 변수;

        while (true) {

            while (sum >= c) {
                sum = sum - c;
                num++;
                count++;
            }

            num = num + sum;
            //남은 빈병과 오늘 마신 빈병을 더함
            if (num < c) {
                break;
            }

            sum = 0;
            while (num >= c) {  //나머지 빈병으로 더 마실수 있나 확인
                num = num - c;
                sum++;
                count++;
            }

            sum = sum + num;
            if (num < c) {
                break;
            }
            //다시 한번 마신병수 체크후 c보다 크면 첫번째 while문으로 돌아감.
        }
        System.out.println(count);
    }
}
