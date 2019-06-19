// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int totalSum = 0;
        for(int i =0; i<A.length; i++){
            totalSum += A[i];
        }
        //System.out.println("sum: " + totalSum);
        int currDiff = totalSum-(2*A[0]);
        int minDiff = Math.abs(currDiff);
        //System.out.println("currDiff: " + currDiff);
        for(int i=1; i<A.length-1; i++){
            currDiff -= 2*A[i];
            //System.out.println("currDiff: " + currDiff);
            if(Math.abs(currDiff) < minDiff){
                if(currDiff == 0)
                    return 0;
                minDiff=Math.abs(currDiff);
            }
        }
        return minDiff;
    }
}