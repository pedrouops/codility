// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int sum = 0;
        int car0 = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i]==0)
                car0++;
            else{
                sum+=car0;
                if(sum > 1000000000)
                    return -1;
            }
        }
        return sum;
    }
}