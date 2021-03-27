package beakjoon;
//2021.03.27
import java.util.Scanner;

public class Q9325 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int total = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < total; i++) {
            int car = scanner.nextInt();
            int option = scanner.nextInt();

            if (option == 0) {
                System.out.println(car);
            } else {
                for (int j = 0; j < option; j++) {
                    int 옵션종류 = scanner.nextInt();
                    int 옵션가격 = scanner.nextInt();

                    for (int k = 0; k < 옵션종류; k++) {
                        sum = sum + 옵션가격;
                    }
                }
                System.out.println(car + sum);
                sum = 0;
            }
        }
    }
}
