// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        int[] first = new int[S.length()+1];
        int[] second = new int[S.length()+1];
        int[] third = new int[S.length()+1];

        for(int i = 0 ; i < S.length(); i++){
            char ch = S.charAt(i);
            int a = 0;
            int b = 0;
            int c = 0;
            switch(ch){
                case 'A': a=1; break;
                case 'C': b=1; break;
                case 'G': c=1; break;
            }
            first[i+1]= first[i] + a;
            second[i+1]=second[i] + b;
            third[i+1]=third[i] + c;
        }
        
        int[] solution = new int[P.length];
        for(int i = 0 ; i < P.length; i++){
            solution[i] = bestSolution(P[i], Q[i], first, second, third);
        }
        return solution;
        
    }
    public int bestSolution(int beg, int end, int[] first, int[] second, int[] third){
        int best = 4;
        int b = beg ;
        int e = end + 1;
        if(first[e] - first[b] > 0)
                return 1;
        else{
            if(second[e] - second[b] > 0)
                return 2;
            else
                if(third[e] - third[b] > 0)
                    return 3;
        }   
        
        return best;
    }
}