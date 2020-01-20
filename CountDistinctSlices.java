import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;

public class CountDistinctSlices {
    public int solution2(int M, int[] A) {
        int slices = A.length;
        LinkedList<Integer> presentValues = new LinkedList<>();

        int x = 0, y = 0;
        while(y < A.length) {
            if(x < A.length && !presentValues.contains(A[x])) {
                presentValues.addLast(A[x]);
                if(x != 0)
                    slices++;
                System.out.println(presentValues.size() + ", " + x + ", " + y + ", " + slices + ", " + A[x] + " isnt present");
            }
            else {
                presentValues.addLast(A[x]);
                while(y < A.length - 1) {
                    y++;
                    presentValues.removeFirst();
                    if(A[y] != A[x])
                        slices++;
                    System.out.println(presentValues.size() + ", " + x + ", " + y + ", " + slices);
                    if(A[y - 1] == A[x])
                        break;
                }
            }
            x++;
        }
        return slices;
    }

    public int solution(int M, int[] A) {
        int slices = A.length;
        Map<Integer, Integer> presentValues = new HashMap<>();

        for(int i = 0; i < A.length; i++) {
            if(!presentValues.containsKey(A[i])) {
                presentValues.put(A[i], i);
                slices = Math.min((int) 1E9, slices + presentValues.size() - 1);
            }
            else {
                if(i - presentValues.get(A[i]) != 1)
                    i--;
                presentValues.clear();
                presentValues.put(A[i], i);
            }
        }
        return slices;
    }
}
