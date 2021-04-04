package beakjoon;
//2021.04.02
//2021.04.04
//이해하기..
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2965 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] position = br.readLine().split(" ");
        int left = Integer.parseInt(position[0]);
        int middle = Integer.parseInt(position[1]);
        int right = Integer.parseInt(position[2]);

        System.out.println(solve(left, middle, right));
    }

    private static int solve(int left, int middle, int right) {
        if (middle - left == 1 && right - middle == 1) return 0;
        int pixPosition = findFixPosition(left, middle, right);

        return Math.abs(pixPosition - middle) - 1;
    }

    private static int findFixPosition(int left, int middle, int right) {
        return right - middle > middle - left ? right : left;
    }
}
