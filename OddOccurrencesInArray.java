import java.util.HashMap;

public class OddOccurrencesInArray {

    public int solution(int[] A) {
        HashMap<Integer, Integer> occurrencesMap = new HashMap<>();

        for(int i : A) {
            if(occurrencesMap.containsKey(i))
                occurrencesMap.put(i, occurrencesMap.get(i) + 1);
            else
                occurrencesMap.put(i, 1);
        }

        for(int i : occurrencesMap.keySet())
            if(occurrencesMap.get(i) % 2 != 0)
                return i;

        throw new RuntimeException(); // Should never get here
    }
}
