// you can also use imports, for example:
//import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        float min = 99999;
        int minIndex = -1;
        float temp;
        for(int i = 0; i<A.length-1; i++){
            temp = (float) (A[i] + A[i+1]) / 2;
            if(temp < min){
                min = temp;
                minIndex = i;
            }
        }
        for(int i = 0; i<A.length-2; i++){
            temp = (float) (A[i] + A[i+1] + A[i+2]) / 3;
            if(temp < min){
                min = temp;
                minIndex = i;
            }
        }
        return minIndex;
    }
}