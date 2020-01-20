import java.util.HashMap;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        HashMap<Integer, Integer> leaves = new HashMap<>();
        int min = Integer.MIN_VALUE;

        for(int i = 0; i < A.length; i++)
            if(!leaves.containsKey(A[i]))
                leaves.put(A[i], i);

        if(leaves.keySet().size() == X) {
            for(int i : leaves.values())
                if(i > min)
                    min = i;
        } else
            return -1;

        return min;
    }
}
