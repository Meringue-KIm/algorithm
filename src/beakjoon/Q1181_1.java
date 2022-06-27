package beakjoon;

import java.util.*;
//compareTo 안쓰고 풀기 실패;
//문자열 앞에 문자열 길이를 붙여서 소트를 했지만 10은 맨 앞 1을 기준으로 정렬하는듯함..
public class Q1181_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        Set<String> setStrings = new LinkedHashSet<>();
        for (int i = 0; i < t; i++) {
            setStrings.add(scanner.next());
        }
        List<String> list = new ArrayList<>(setStrings);
        List<String> Results = new ArrayList<>();
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sb = new StringBuilder();
            String s = String.valueOf(list.get(i).length());
            sb.append(s).append(list.get(i));
            Results.add(i, String.valueOf(sb));
        }
        Collections.sort(Results);
        for (String s : Results) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (97 <= ch && ch <= 122) {
                    sb.append(ch);
                }
            }
            System.out.println(sb);
        }
    }

}
