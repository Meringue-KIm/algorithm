package beakjoon;

import java.util.Scanner;
//2021.01.10
//평균- 1시간 30분걸림 (자랑스럽..)
public class Q1546 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        double[] arr = new double[a];
        double z = 0;
        double w = 0;

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
            if (z < arr[i]) {
                z = arr[i];
            }
        }
        for (int i = 0; i < a; i++) {
            arr[i] = arr[i] / z * 100;
            w += arr[i];
        }
        System.out.println(w / a);
    }
}
