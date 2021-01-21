package gogodan;

import java.util.Scanner;
//2021.01.21
//8,7 입력하면 2단부터 8단이 7곱하기까지만 실행된다...
public class Mission1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        String[] splitedValue = inputValue.split(",");
        int first = Integer.parseInt(splitedValue[0]);
        int second = Integer.parseInt(splitedValue[1]);
        int[] arr = new int[second];

        for (int i = 2; i <= first; i++) {
            for (int j = 0; j < second; j++) {
                arr[j] = i * (j + 1);
                System.out.println(arr[j]);
            }
        }
    }
}
