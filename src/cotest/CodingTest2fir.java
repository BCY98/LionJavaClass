package cotest;

public class CodingTest2fir {
    public int solution(int[][] sizes) {
        int [] maxsize = new int[2];
        int answer = 0;
        for(int j = 0; j < sizes[0].length; j++){
            int maxs = Integer.MIN_VALUE;
            for(int i = 0; i < sizes.length; i++){
                if(sizes[i][j] > maxs){
                    maxs = sizes[i][j];
                }
            }
            maxsize[j] = maxs;
        }

        answer = maxsize[0] * maxsize[1];

        return answer;
    }
}
