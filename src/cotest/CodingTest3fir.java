//package cotest;
//
//public class CodingTest3fir {
//    public String solution(int[] numbers, String hand) {
//        String answer = "";
//
//        int dis;
//        int lh [] = new int[2];
//        int rh [] = new int[2];
//
//        int loc[][] = {{0,0},{1,0},{2,0},{0,1},{1,1},{2,1},{0,2},{1,2},{2,2},{1,3}};
//
//        for(int i = 0; i < numbers.length; i++){
//
//            if(numbers[i] == 0){
//                numbers[i] = 10;
//            }
//
//            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
//                answer += "L";
//                for(int o = 0; o < 2; o++) {
//                    lh[numbers[i] - 1] = loc[numbers[i-1]][o];
//                }
//
//            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
//                answer += "R";
//                for(int o = 0; o < 2; o++) {
//                    lh[numbers[i] - 1] = loc[numbers[i-1]][o];
//                }
//            }else {
//
//
//                    }
//                }
//            }
//        }
//
//
//
//        return answer;
//    }
//}
