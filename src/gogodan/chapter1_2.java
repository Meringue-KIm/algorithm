package gogodan;

//2021.01.21
//구구단 메소드 활용
public class chapter1_2 {
    public static int[] calculate(int times) {
        int[] result = new int[9];
        for (int i = 0; i < result.length; i++) {
            result[i] = times * (i + 1);
        }
        return result;
    }

    public static void print(int[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
