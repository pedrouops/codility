// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        int maxGap = 0;
        int currentGap=0;
        for(int i = 0; i < binary.length(); i++){
            if(binary.charAt(i) == '1'){
                if(currentGap > maxGap)
                    maxGap = currentGap;
                currentGap = 0;
            }
            else if(binary.charAt(i) == '0'){
                currentGap++;
            }
        }
        return maxGap;
    }
}