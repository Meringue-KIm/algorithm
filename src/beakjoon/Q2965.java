package beakjoon;
//2021.04.02
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2965 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        String[] position = br.readLine().split(" ");
        int left = Integer.parseInt(position[0]);
        int middle = Integer.parseInt(position[1]);
        int right = Integer.parseInt(position[2]);

        System.out.println(so(left, middle, right));
    }
}
