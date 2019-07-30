// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        int max = A[A.length-1] * A[A.length-2] * A[A.length-3];
        int max2 = A[0] * A[1] * A[A.length-1] ;
        return Math.max(max,max2);
    }
}