import java.util.Arrays;

public class Distinct {
    public int solution(int[] A) {
        if(A.length == 0)
            return 0;

        Arrays.sort(A);

        int count = 1;

        for(int i = 0; i < A.length - 1; i++)
            if(A[i + 1] != A[i])
                count++;

        return count;
    }
}
