package programmers;

public class Lv1_49 {

    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int a = 5;
        System.out.println(solution(s, skip, a));
    }

    public static String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = 1;
            while (count <= index) {
                ++c;
                if (c > 'z') {
                    c -= 26;
                }
                if (!skip.contains(c + "")) {
                    count++;
                }
            }
            answer.append(c);
        }
        return answer.toString();
    }

}
