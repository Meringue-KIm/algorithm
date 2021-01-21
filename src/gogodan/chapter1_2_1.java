package gogodan;
//2021.01.21
//구구단 클래스 활용
//클래스 앞글자는 대문자 메소드 앞글자는 소문자 관례~!
public class chapter1_2_1 {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            int[] result = chapter1_2.calculate(i);
            chapter1_2.print(result);
        }
    }
}
