import java.util.HashMap;

public class PermCheck {
    public int solution(int[] A){
        HashMap<Integer, Integer> occurrences = new HashMap<>();

        for(int i : A) {
            if(i > A.length)
                return 0;
            if(occurrences.keySet().contains(i))
                occurrences.put(i, occurrences.get(i) + 1);
            else
                occurrences.put(i, 1);
        }

        for(int i : occurrences.values())
            if(i != 1)
                return 0;

        return 1;
    }
}
