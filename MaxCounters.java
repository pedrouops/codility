// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] solution = new int[N];
        int max = 0;
        int allUpdate = 0;
        for(int i : A){
            if (i==N+1)
                allUpdate = max;
            else{
                solution[i-1]=Math.max(allUpdate + 1, solution[i-1]+1);
                if(solution[i-1] > max) max=solution[i-1];
            }
        }
        for(int i = 0 ; i< N; i++){
            if(solution[i]<allUpdate)
                solution[i]=allUpdate;
        }
        return solution;
    }
}