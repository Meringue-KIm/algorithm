package beakjoon;
//2021.08.15
import java.util.Scanner;

public class Q2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();

        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < arr.length; i++) {
            if (str.contains(arr[i])) {
                str = str.replaceAll(arr[i], " ");
            }
        }
        System.out.println(str.length());
    }
}
