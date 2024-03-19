package cotest;

import java.util.regex.Pattern;

public class CodingTest4fir {
    public int solution(String[] babbling) {
        int answer = 0;

        String [] ba = {"aya","ye","woo","ma"};
        String dot = "";
        for(int i = 0; i < babbling.length; i++){
            for(int j = 0; j < 4; j++){
                babbling[i] = babbling[i].replaceAll(Pattern.quote(ba[j]),".");
                }
            babbling[i] = babbling[i].replace(".","");
                if(babbling[i].equals("")){
                    answer++;
                }
        }
        return answer;
    }
}
