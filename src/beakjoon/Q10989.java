package beakjoon;
//2022.01.31
//수 정렬하기3
import java.util.*;

public class Q10989 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        StringBuffer stringBuffer = new StringBuffer();
        for (Integer integer : arr) {
            stringBuffer.append(integer).append("\n");
        }
        System.out.println(stringBuffer);
    }

}

