
package cotest;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CodingTest2sec {
    public int solution(int[][] sizes) {
        int answer = 0;

        int max_width = 0;
        int max_height = 0;

        for (int[] size : sizes) {
            int width = Math.max(size[0], size[1]);
            int height = Math.min(size[0], size[1]);

            max_width = Math.max(max_width, width);
            max_height = Math.max(max_height, height);
        }

        answer = max_width * max_height;

        return answer;
    }
}
