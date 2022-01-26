package programmers;
//서울에서 김서방 찾기
public class Lv1_24 {

    public String solution(String[] seoul) {
        int num = 0;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                num = i;
            }
        }
        return "김서방은 " + num + "에 있다";
    }
}
