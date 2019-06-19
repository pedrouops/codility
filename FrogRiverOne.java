// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        int[] path = new int[X];
        int count = 0;
        for(int i = 0; i<A.length; i++){
            if(path[A[i]-1]==0){
                path[A[i]-1]=1;
                count++;
                if(count==X) return i;
            }
        }
        return -1;
    }
}