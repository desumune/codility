public class MaxDoubleSliceSum {
    public int solution(int[] A) {
        int[] fromStart = new int[A.length];
        int[] fromEnd = new int[A.length];

        for(int i = 1; i < A.length - 1; i++){
            fromStart[i] = Math.max(fromStart[i - 1] + A[i], 0);
        }
        for(int i = A.length - 2; i > 0; i--){
            fromEnd[i] = Math.max(fromEnd[i + 1] + A[i], 0);
        }

        int max = 0;

        for(int i = 1; i < A.length - 1; i++){
            max = Math.max(max, fromStart[i - 1] + fromEnd[i + 1]);
        }

        return max;
    }
}
