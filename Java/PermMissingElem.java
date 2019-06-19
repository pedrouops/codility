// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        if(A == null || A.length < 1) return 1;

        long elements = A.length + 1;
        long count = ((elements * (elements + 1))/2);

        for(int i : A){
            count -= i;
        }
        return ( (int) count);
    }
}