// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int Y, int D) {
        int jumps = (Y-X)/D;
        if( (Y-X)%D == 0)
            return jumps;
        return jumps+1;
    }
}