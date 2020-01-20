public class Catepillar {
    public int[] solution(int[] A, int N) {
        int start = 0, end = 0;

        while(start < A.length && end < A.length) {
            int sum = 0;

            for(int j = start; j <= end; j++) {
                sum += A[j];
            }

            if(sum == N) {
                return new int[]{start, end};
            }
            else if(sum < N)
                end++;
            else
                start++;
        }
        return new int[]{};
    }
}
