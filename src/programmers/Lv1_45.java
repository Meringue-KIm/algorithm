package programmers;
//다트게임 (실패)

public class Lv1_45 {

    public static void main(String[] args) {
        System.out.println(solution("1S2D*3T"));
    }

    public static int solution(String dartResult) {
        int answer = 0;
        String temp = ""; // 문자열 내 1번의 점수 저장 변수
        int arr[] = new int[3]; // 3번의 점수를 저장할 배열
        int idx = 0; // 배열을 참조하기 위한 idx

        // 1. dartResult 문자열 탐색.
        for (int i = 0; i < dartResult.length(); i++) {
            // 1-1. 문자열의 각 문자에 따라 조건 처리.
            switch (dartResult.charAt(i)) {
                // 1-2. *인 경우는 자신과 이전의 점수 *2, idx는 S,D,T 처리 후 증가하기 때문에 idx-1, idx-2 후 *2
                case '*':
                    arr[idx - 1] *= 2;
                    if (idx > 1) arr[idx - 2] *= 2;
                    break;
                // 1-3. #은 자신의 점수를 음수로 만든다.
                case '#':
                    arr[idx - 1] *= -1;
                    break;
                // 1-4. S는 1제곱, 다음 점수를 위해 idx를 증가시키고 정수를 저장하는 temp를 초기화.
                case 'S':
                    arr[idx] = (int) Math.pow(Integer.parseInt(temp), 1);
                    idx++;
                    temp = "";
                    break;
                // 1-5. D는 2제곱, 다음 점수를 위해 idx를 증가시키고 정수를 저장하는 temp를 초기화.
                case 'D':
                    arr[idx] = (int) Math.pow(Integer.parseInt(temp), 2);
                    idx++;
                    temp = "";
                    break;
                // 1-6. T는 3제곱, 다음 점수를 위해 idx를 증가시키고 정수를 저장하는 temp를 초기화.
                case 'T':
                    arr[idx] = (int) Math.pow(Integer.parseInt(temp), 3);
                    idx++;
                    temp = "";
                    break;
                // 1-7. 그 외의 정수들은 temp 변수에 저장해 둔다.
                default:
                    temp += String.valueOf(dartResult.charAt(i));
                    break;
            }
        }

        // 2. 위 과정을 통해 구한 각 횟수의 점수를 모두 더하면 정답.
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        return answer;
    }

}
//    public static int solution(String dartResult) {
//        List<String> list = new ArrayList<>();
//        char[] strings = dartResult.toCharArray();
//        for (int i = 0; i < strings.length; i++) {
//            char s = strings[i];
//            if (s == 'S') {
//                list.add("*" + "1");
//            } else if (s == 'D') {
//                list.add("+" + strings[i - 1]);
//            } else if (s == 'T') {
//                list.add("+" + strings[i - 1] + "*" + strings[i - 1]);
//            }
//            if (s >= 48 && s <= 57) {
//                if (i != 0) {
//                    list.add("*" + s);
//                } else {
//                    list.add(String.valueOf(s));
//                }
//            }
//            if (s == 42) {
//                for (int j = i; j < strings.length; j++) {
//                    char c = strings[j];
//                    if (c == 42) {
//                        list.add("*2");
//                    } else if (c == 35) {
//                        list.add("*2");
//                        list.add("-1");
//                    }
//                }
//            } else if (s == 35) {
//                for (int j = i; j < strings.length; j++) {
//                    char c = strings[j];
//                    if (c == 42) {
//                        list.add("-1");
//                        list.add("*2");
//                    } else if (c == 35) {
//                        list.add("-1");
//                    }
//                }
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        for (String s : list) {
//            sb.append(s);
//        }
//        String[] str = new String[sb.length()];
//        for (int i = 0; i < sb.length(); i++) {
//            str[i] = String.valueOf(sb.charAt(i));
//        }
//        LinkedList<Integer> intList = new LinkedList<>();
//        LinkedList<String> stringList = new LinkedList<>();
//        for (String s : str) {
//            if (s.equals("*") || s.equals("+") || s.equals("-")) {
//                stringList.add(s);
//            } else {
//                intList.add(Integer.parseInt(s));
//            }
//        }
//        while (!stringList.isEmpty()) {
//            int prevNum = intList.poll();
//            int nextNum = intList.poll();
//            String op = stringList.poll();
//            switch (op) {
//                case "+":
//                    intList.addFirst(prevNum + nextNum); //addFirst 배열 제일 앞에 넣는다
//                    break;
//                case "-":
//                    intList.addFirst(prevNum - nextNum);
//                    break;
//                case "*":
//                    intList.addFirst(prevNum * nextNum);
//                    break;
//                case "/":
//                    intList.addFirst(prevNum / nextNum);
//                    break;
//            }
//        }
//        return intList.poll();
//    }


