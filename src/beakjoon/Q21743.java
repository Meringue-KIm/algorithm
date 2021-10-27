package beakjoon;
//2021.10.27
//러시아어 문제 틀림
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q21743 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            map.put(scanner.next(), scanner.nextInt());
        }
        String str = scanner.next();

        int t = scanner.nextInt();

        String[] strArr = new String[t];

        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < t; i++) {
            strArr[i] = scanner.next();
            while (str.contains(strArr[i])) {
                str = str.replace(strArr[i], "");
                newString.append(strArr[i]);
            }
        }
        int 정답 = 0;
        for (int i = 0; i < newString.length(); i++) {
            char str123 = newString.charAt(i);
            String str1234 = String.valueOf(str123);
            정답 += map.get(str1234);
        }
        System.out.println(정답);
    }
}
