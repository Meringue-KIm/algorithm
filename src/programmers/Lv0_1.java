package programmers;

public class Lv0_1 {

    public int solution(int[][] sizes) {
        int length = sizes[0][0];
        int width = sizes[0][1];
        int index = 0;
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < sizes[i].length; j++) {
                if (sizes[i][0] > length) {
                    length = sizes[i][0];
                }
                if (sizes[i][1] > width) {
                    width = sizes[i][1];
                    index = i;
                }
            }
            if (sizes[index][1] > sizes[index][0]) {
                int num = sizes[index][0];
                sizes[index][0] = sizes[index][1];
                sizes[index][1] = num;
                length = sizes[0][0];
                width = sizes[0][1];
                i = -1;
            }
        }
        return length * width;
    }

}

