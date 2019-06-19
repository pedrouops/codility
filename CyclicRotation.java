// you can also use imports, for example:
// import java.util.*;
import java.util.*;
import java.util.stream.Collectors;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        if(A == null || A.length <= 1) return A;
        int sizeA = A.length;
        int splitPos = K % sizeA;

        if (splitPos == 0) return A;
        
        splitPos = sizeA - splitPos;
        
        ArrayList<Integer> r = new ArrayList<>();
        List<Integer> tempA = Arrays.stream(A).boxed().collect(Collectors.toList());

        r.addAll(tempA.subList(splitPos,tempA.size()));
        r.addAll(tempA.subList(0,splitPos));
        
        return r.stream().mapToInt(Integer::intValue).toArray();
    }
}