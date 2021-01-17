package beakjoon;

import java.util.Scanner;

//2021.01.14
//아스키코드 활용  준성이가 도와줌
public class Q10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String 입력받은_문자열 = scanner.nextLine();
        int[] 알파벳위치배열 = new int[26];

        for (int i = 0; i < 알파벳위치배열.length; i++) {
            알파벳위치배열[i] = -1;
        }
//        Arrays.fill(알파벳위치배열, -1);

        for (int i = 0; i < 입력받은_문자열.length(); i++) {
            int 알파벳위치 = 입력받은_문자열.charAt(i) - 'a';
            if (알파벳위치배열[알파벳위치] != -1) {
                continue;
            }
            알파벳위치배열[알파벳위치] = i;
        }
        for (int i : 알파벳위치배열) {
            System.out.print(i + " ");
        }
    }
}

//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//
//        int[] arr = new int[26];
//
//        for(int i = 0; i < arr.length; i++) {
//            arr[i] = -1;
//        }
//
//        String S = in.nextLine();
//
//        for(int i = 0; i < S.length(); i++) {
//            char ch = S.charAt(i);
//
//            if(arr[ch - 'a'] == -1) {	// arr 원소 값이 -1 인 경우에만 초기화
//                arr[ch - 'a'] = i;
//            }
//        }
//
//        for(int val : arr) {	// 배열 출력
//            System.out.print(val + " ");
//        }
//    }
//}
