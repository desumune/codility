public class MissingInteger {
    public int solution(int[] A) {
        int max = Integer.MIN_VALUE;

        for(int i : A)
            max = Math.max(max, i);

        if(max <= 0)
            return 1;

        boolean[] isPresent = new boolean[max - 1];

        for(int i = 0; i < A.length; i++)
            if (A[i] > 0 && A[i] < max)
                isPresent[A[i] - 1] = true;

        for(int i = 0; i < isPresent.length; i++)
            if(!isPresent[i])
                return i + 1;

        return max + 1;
    }
}
