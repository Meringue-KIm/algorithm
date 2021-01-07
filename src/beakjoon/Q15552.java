package beakjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//2021.01.07
//빠른 A+B-----------------------------------존나 어려워서 준성이가 풀어줌
public class Q15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++){
            String s = sc.readLine(); // 한 줄 입력받기
            StringTokenizer st = new StringTokenizer(s); // 공백으로 분리하기 위해 StringTokenizer 객체가 필요함
            // BufferReader는 공백분리할때 쟤가 꼭필요. Scanner는 X
            String s1 = st.nextToken();
            int a = Integer.parseInt(s1); //또 ㅈ같은게 입력받아진게 거의 무조건  String로만 받아져서 Integer로
            //바꾸는 작업을 하는거./
            int b = Integer.parseInt(st.nextToken());
            stringBuilder.append(a + b + "\n");
            // 더하고 저장해두는거임
            //왜냐면 System.out.print는 느려서 n번 호출하면 너무 느려서 통과못함. 미리 저장해두고 밑에서 한번에 출력하는거
        }
        System.out.println(stringBuilder.toString());
    }
}
