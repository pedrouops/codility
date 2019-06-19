// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        if (A == null || A.length < 2) return 0;

        int sum = calcSum(A);

        int minDiff = 2*A[0] - sum;
        int absMinDiff = Math.abs(minDiff);

        int currDiff = minDiff;

        for(int i = 1; i < A.length-1; i++){
            currDiff += 2*A[i];
            int t = Math.abs(currDiff);
            if (t < absMinDiff)
                absMinDiff = t;
            if (absMinDiff == 0) return absMinDiff;
        }
        return absMinDiff;
    }
    public int calcSum(int[] A){
        int sum = 0;
        for(int i = 0; i< A.length; i++){
            sum+=A[i];
        }
        return sum;
    }
}