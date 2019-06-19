// you can also use imports, for example:
// import java.util.*;
import java.util.HashSet;
import java.util.Set;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> pairs = new HashSet<Integer>();

        for(int i : A){
            if(pairs.contains(i))
                pairs.remove(i);
            else
                pairs.add(i);
        }

        return pairs.toArray(new Integer[1])[0];
    }
}