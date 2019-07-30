// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        if(A.length == 0) return 0;
        
        Arrays.sort(A);
        int dist = 1;
        for(int i = 1; i < A.length; i++){
            if(A[i-1] != A[i])
                dist++;
        }
        return dist;
    }
}
