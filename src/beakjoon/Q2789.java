package beakjoon;
//2021.04.11
//이해중
import java.util.Scanner;

public class Q2789 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] cArr = {'C', 'A', 'M', 'B', 'R', 'I', 'D', 'G', 'E'};
        String str = scan.next();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            boolean check = true;
            for (int j = 0; j < cArr.length; j++) {
                if (str.charAt(i) == cArr[j]) {    // 입력받은 문자가 char 배열에 포함된 알파벳인경우
                    check = false;    // 제거해야하므로 check => false 로 설정
                    break;
                }
            }
            // 입력받은 문자가 char 배열에 포함된 알파벳이 아닐경우(check == true)
            if (check) {
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
