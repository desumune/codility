//Min 2 elements in a slice
public class MaxSumSlice {
    public int solution(int[] A) {
        if(A.length < 2)
            return 0;

        int maxSum = A[0] + A[1], currentSum = A[0];

        for(int i = 1; i < A.length; i++) {
            currentSum = Math.max(A[i - 1] + A[i], currentSum + A[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
