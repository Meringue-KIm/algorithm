package beakjoon;
//2021.07.03 - 시간초과 (Scanner 때문인가, System.out.print 때문인가..)
//Builder 사용해서 다시 풀기
//2021.07.11 - 입출력 문제가 아닙니다;;
//알고리즘 시간복잡도 공부해서 다시 풀기
import java.util.Arrays;
import java.util.Scanner;

public class Q11728 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int[] arr = new int[A];
        int[] arr1 = new int[B];

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            count++;
        }
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
            count++;
        }
        int[] arr2 = new int[count];

        for (int i = 0; i < A; i++) {
            arr2[i] = arr[i];
        }
        for (int i = 0; i < B; i++) {
            arr2[i + A] = arr1[i];
        }
        Arrays.sort(arr2);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
