// you can also use imports, for example:
// import java.util.*;
import java.util.*; 


// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int size = A.length;
        int sum = (size*(size+1))/2;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : A){
            sum-=i;
            if(set.contains(i)) return 0;
            set.add(i);
        }
        return sum==0? 1 : 0;
    }
}