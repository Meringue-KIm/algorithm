package beakjoon;
//2021.08.07
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2744 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <Character> arr = new ArrayList<>();
//        char ch = 'a'+2;
//        System.out.println(ch);
        String str = scanner.next();


        for (int i = 0; i < str.length(); i++) {
            arr.add(str.charAt(i));
            if (arr.get(i) > 91) { //대문자
                for (int j = 65; j < 92; j++) {
                    if (arr.get(i) == j) {
                        char 대문자 = 32;
                        char 저장공간 = 0;
                       저장공간 = arr.get(i);
                       arr.add(i, 대문자 + 저장공간);
                    }
                }
            }
        }

    }
}
