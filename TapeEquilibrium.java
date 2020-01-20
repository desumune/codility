import java.util.ArrayList;

public class TapeEquilibrium {
    public int solution(int[] A) {
        ArrayList<Integer> differences = new ArrayList<>();

        int sumAll = 0;
        int sumLeft = 0;

        for(int i: A)
            sumAll += i;

        for(int p = 1; p < A.length; p++) {
             sumLeft += A[p - 1];
             int sumRight = sumAll - sumLeft;

            differences.add(Math.abs(sumLeft - sumRight));
        }

        int minDiff = Integer.MAX_VALUE;

        for(int i : differences)
            if(i < minDiff)
                minDiff = i;

        return minDiff;
    }
}
