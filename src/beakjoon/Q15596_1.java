package beakjoon;

//2021.01.15
//정수 N개의 합
class Q15596_1 {
    long sum(int[] a) {
        long sum = 0;    // a 배열 정수 합 변수

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
