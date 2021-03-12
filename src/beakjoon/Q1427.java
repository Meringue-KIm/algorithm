package beakjoon;
//2021.03.12
//nextLine().toCharArray() 사용
import java.util.Arrays;
import java.util.Scanner;

public class Q1427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] arr = scanner.nextLine().toCharArray();

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}

